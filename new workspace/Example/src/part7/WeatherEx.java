/*
    OpenAPI: https://openweathermap.org/
    1.URL 객체 생성: 웹 리소스에 대한 URL을 생성합니다.
    2.연결 초기화 : URL 객체의 openConnection() 메서드를 호출하여 HttpURLConnection 객체를 얻습니다.
    3.HTTP 메서드 설정 : HttpURLConnection 객체의 setRequestMethod() 메서드를 사용하여 원하는 HTTP 메서드(예: GET, POST 등)를 설정합니다.
    4.요청 헤더 설정 (선택 사항) : 필요한 경우, setRequestProperty() 메서드를 사용하여 요청 헤더를 설정합니다.
    5.요청 본문 작성 (선택 사항) : POST, PUT과 같은 메서드를 사용할 때, 출력 스트림을 사용하여 요청 본문을 작성합니다.
    6.서버 응답 확인 : getResponseCode() 메서드를 호출하여 서버에서 반환한 HTTP 응답 코드를 확인합니다.
    7.응답 헤더 읽기 (선택 사항) : 필요한 경우, getHeaderField() 또는 관련 메서드를 사용하여 응답 헤더를 읽습니다.
    8.응답 본문 읽기 : InputStream을 사용하여 응답 본문을 읽고 처리합니다.
    9.연결 종료 : 연결을 끊고 리소스를 해제합니다.
*/
package part7;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class WeatherEx {
    public static void main(String[] args) {
        String urlStr = getUrl("Seoul");
        try {
            HttpURLConnection conn = getConncection(urlStr);

            if(isConnSuccessfully(conn)){
                StringBuilder content = getResponseContent(conn);
                double temp = getTemperature(content);
                printgetTemperature(temp);
            } else{
                System.out.println("요청 실패");
            }
            conn.disconnect(); // 연결 종료 : 연결을 끊고 리소스를 해제.
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    private static String getUrl(String city) {
        String apiKey = APIInfo.WEATHERAPIKEY;
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" +
                apiKey + "&units=metric";
        return url;
    }

    private static HttpURLConnection getConncection(String urlStr) throws IOException{
//      URL 객체 생성: 웹 리소스에 대한 URL을 생성합니다.
        URL url = new URL(urlStr);
//      연결 초기화 : URL 객체의 openConnection() 메서드를 호출하여 HttpURLConnection 객체를 얻습니다.
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        return conn;
    }

    private static void setRequest(HttpURLConnection conn) throws IOException{
//      HTTP 메서드 설정 : HttpURLConnection 객체의 setRequestMethod() 메서드를 사용하여 원하는 HTTP 메서드(예: GET, POST 등)를 설정합니다.
        conn.setRequestMethod("GET");
//      요청 헤더 설정 (선택 사항) : 필요한 경우, setRequestProperty() 메서드를 사용하여 요청 헤더를 설정합니다.
        conn.setRequestProperty("Accept", "application/json");
    }
    
    private static boolean isConnSuccessfully(HttpURLConnection conn) throws IOException{
        setRequest(conn);

//      서버 응답 확인 : getResponseCode() 메서드를 호출하여 서버에서 반환한 HTTP 응답 코드를 확인합니다.
        int responseCode = conn.getResponseCode();
        System.out.println("response code: "+ responseCode);

        return responseCode==200;
    }

    private static StringBuilder getResponseContent(HttpURLConnection conn) throws IOException{
//      응답 본문 읽기 : InputStream을 사용하여 응답 본문을 읽고 처리합니다.
//      네트워크 통신에서 데이터를 주고 받기 위해 스트림을 생성해야 하므로, conn이라는 HTTP 연결 객체로부터 입력 스트림을 얻는다.
//      이 입력 스트림은 웹 서버로부터의 데이터를 읽어오는 데 사용된다.
//      InputStreamReader(문자스트림) 바이트 기반의 입력 스트림을 문자 기반의 입력 스트림으로 변환해준다.
//      HTTP 연결의 입력 스트림은 바이트 단위로 데이터를 전송하지만, InputStreamReader를 통해 문자로 변환되어서 처리한다.
//      (즉 InputStreamReader는 conn의 input stream과 연결해둔 또 다른 스트림이다.)
//        BufferedReader는 스트림의 데이터를 한 곳에 모으고 한 번에 출력하기 위해 사용한다.
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

//      Stream 읽기
        String inputLine;
        StringBuilder content = new StringBuilder();
        while((inputLine=in.readLine())!=null){
            content.append(inputLine);
        }
        in.close();

        return content;
    }

    private static double getTemperature(StringBuilder content){
//      Gson으로 온도 추출
        JsonObject weatherData = JsonParser.parseString(content.toString()).getAsJsonObject();
        JsonObject mainData = weatherData.getAsJsonObject("main");
        double temp = mainData.get("temp").getAsDouble();
        return temp;
    }

    private static void printgetTemperature(double temperature){
//      서울의 온도 출력
        System.out.println("서울 온도: "+temperature+"ºC");
    }
}
