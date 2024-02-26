package part7;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

// Jsoup은 HTML문서를 읽고 파싱하여 웹 크롤링, 웹 스크레이핑, 데이터 추출 등의 작업을 수행한다.
// 공식 문서: https://jsoup.org/apidocs/
/*
| 메서드                   | 설명                                                                |
|------------------------|---------------------------------------------------------------------|
| Jsoup.connect(url)     | 주어진 URL에 연결을 시도한다.                                        |
| document.get()         | 연결 객체를 사용하여 웹 페이지의 내용을 가져온다.                      |
| Jsoup.parse(html)      | 주어진 HTML 문자열을 파싱하여 Document 객체를 생성한다.                 |
| document.getElementById(id) | 주어진 ID에 해당하는 요소를 찾아서 Element 객체로 반환한다.           |
| document.select(selector) | 주어진 CSS 선택자와 일치하는 모든 요소를 찾아서 Elements 객체로 반환한다. |
| element.text()         | 주어진 요소의 텍스트 내용을 가져온다.                                  |
| element.attr(attribute) | 주어진 요소의 속성 값을 가져온다.                                    |
| element.html()         | 주어진 요소의 내부 HTML을 가져온다.                                    |
| element.outerHtml()    | 주어진 요소와 그 내부 HTML을 모두 가져온다.                            |
| element.tagName()      | 주어진 요소의 태그 이름을 가져온다.                                    |
| element.parent()       | 주어진 요소의 부모 요소를 반환한다.                                    |
| element.children()     | 주어진 요소의 자식 요소들을 반환한다.                                  |
| element.nextElementSibling() | 주어진 요소의 다음 형제 요소를 반환한다.                            |
| element.previousElementSibling() | 주어진 요소의 이전 형제 요소를 반환한다.                        |
| element.addClass(className)    | 주어진 요소에 클래스를 추가한다.                                    |
| element.removeClass(className) | 주어진 요소에서 클래스를 제거한다.                                   |
| element.hasClass(className)    | 주어진 요소가 해당 클래스를 가지고 있는지 여부를 반환한다.           |
| element.attr(attribute, value) | 주어진 요소의 속성 값을 설정한다.                                    |
| element.append(html)   | 주어진 요소에 내부 HTML의 끝에 추가할 HTML을 지정한다.                |
| element.prepend(html)  | 주어진 요소에 내부 HTML의 시작 부분에 추가할 HTML을 지정한다.         |
| element.remove()       | 주어진 요소를 DOM에서 제거한다.                                      |
*
* */
public class JsoupEx {
    private static String url = "https://sum.su.or.kr:8888/bible/today";
    public static void main(String[] args) {
        // https://sum.su.or.kr:8888/bible/today 크롤링
        Document document = getDocument(url);

        if(document==null) return;
        
        // id로 요소 찾기
        Element bibleText = getElementById(document, "bible_text");
        Element bibleInfoBox = getElementById(document, "bibleinfo_box");
        
        // css 식별자로 찾기
        Elements numElements = getElementsBySelect(document,".num");
        Elements infoElements = getElementsBySelect(document,".info");


        // 출력
        System.out.println(bibleText.text());
        System.out.println(bibleInfoBox.text());
        System.out.println();

        for(int i=0;i<numElements.size();i++){
            System.out.println(numElements.get(i).text()+" : "+infoElements.get(i).text());
        }
    }
    private static Document getDocument(String url) {
        try {
            return Jsoup.connect(url).get();
        } catch (IOException io){
            System.out.println(io+ " 연결 실패");
            return null;
        }
    }

    private static Element getElementById(Document document, String id){
        return document.getElementById(id);
    }
    private static Elements getElementsBySelect(Document document, String select){
        return document.select(select);
    }
}
