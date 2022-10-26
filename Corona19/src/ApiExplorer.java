import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import corona.*;

public class ApiExplorer {

	public static void main(String[] args) {
		new ApiExplorer().run();
	}

	// run메서드
	private void run() {
		// 1. 요청 url 생성
		StringBuilder urlBuilder = new StringBuilder(
				"http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19SidoInfStateJson");
		try { // 문자열 참조변수 urlBuilder가 괄호 안 내용을 버퍼에 저장한다.
			urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8")
					+ "=rKsP5dq4qNXofML8UCQlfj7DHfHbYxt5K1kPFQUhAA0lUail3L%2BFNsx4dgFNg9lOt%2B%2BQ4MpLP0DlXvh6FBxRrw%3D%3D");
			urlBuilder.append("&"+URLEncoder.encode("pageNo","UTF-8")+"="+URLEncoder.encode("1","UTF-8"));//페이지 번호
			urlBuilder.append(URLEncoder.encode("10","UTF-8"));//한 페이지 결과 수
			urlBuilder.append("&"+URLEncoder.encode("startCreateDt", "UTF-8")+"="+URLEncoder.encode("20220519", "UTF-8"));//검색할 생성일
			urlBuilder.append("&"+URLEncoder.encode("endCreateDt", "UTF-8")+"="+URLEncoder.encode("20220519", "UTF-8"));//검색할 생성일범위의 종료
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		//2. connection 객체 생성
		URL url = null;
		HttpURLConnection conn = null;
		try {
			url = new URL(urlBuilder.toString()); //StringBuilder를 문자열로 반환
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-type", "application/json");
			System.out.println("Response code : "+conn.getResponseCode());
		} catch (MalformedInputException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//3. 요청전송 및 응답 처리
		BufferedReader br = null;
		try {
			int statusCode = conn.getResponseCode();
			System.out.println(statusCode);
			if (statusCode >=200 && statusCode<=300) {
				br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
			} else {
				br=new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			Document doc = parseXML(conn.getInputStream());
			//a. item 태그개게 목록으로 가져온다.
			NodeList descNodes = doc.getElementsByTagName("item");
			//b. Corona19Data List객체 생성
			List<Corona19Data> list = new ArrayList<>();
			//c. 각 item태그의 자식 태그에서 정보 가져오기
			for (int i = 0; i < descNodes.getLength(); i++) {
				//item
				Node item = descNodes.item(i);
				Corona19Data data = new Corona19Data();
				//item 자식태그에 순차적으로 접근
				for (Node node = item.getFirstChild(); node !=null ; node = node.getNextSibling()) {
					System.out.println(node.getNodeName()+" : "+node.getTextContent());
					switch (node.getNodeName()) {
					case "seq" : 
						data.setSeq(Integer.parseInt(node.getTextContent()));
						break;
					case "createDt":
						data.setCreateDt(node.getTextContent());
						break;
					case "deatCnt":
						data.setDeathCnt(Integer.parseInt(node.getTextContent()));
						break;
					case "defCnt":
						data.setDefCnt(Integer.parseInt(node.getTextContent()));
						break;
					case "gubun":
						data.setGubun(node.getTextContent());
						break;
					case "gubunEn":
						data.setGubunEn(node.getTextContent());
						break;
					case "gubunCn":
						data.setGubunCn(node.getTextContent());
						break;
					case "incDec":
						data.setIncDec(Integer.parseInt(node.getTextContent()));
						break;
					case "isolClearCnt":
						data.setIsolClearCent(Integer.parseInt(node.getTextContent()));
						break;
					case "localOccCnt":
						data.setLocalOccCnt(Integer.parseInt(node.getTextContent()));
						break;
					case "overFlowCnt":
						data.setOverFlowCnt(Integer.parseInt(node.getTextContent()));
						break;
					case "qurRate":
						data.setQurRate(node.getTextContent());
						break;
					case "stdDay":
						data.setStdDay(node.getTextContent());
						break;
					case "updateDt" :
						data.setUpdateDt(node.getTextContent());
						break;
					}
				}
				//d. List에 객체 추가
				list.add(data);
			}
			//e. 최종확인
			for (Corona19Data corona19Data : list) {
				System.out.println(corona19Data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//4. 자원 반환
		conn.disconnect();
	}
	
	private Document parseXML(InputStream stream) {
		DocumentBuilderFactory objDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder objDocumentBuilder = null;
		Document doc = null;
		try {
			objDocumentBuilder = objDocumentBuilderFactory.newDocumentBuilder();
			doc = objDocumentBuilder.parse(stream);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		catch (SAXException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return doc;
	}

}
