package part6.collection;
import java.util.*;
public class MapBasic {
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();

        // 추가
        studentScores.put("Kim", 95);
        studentScores.put("Lee", 85);
        studentScores.put("Park", 90);
        studentScores.put("Choi", 80);

        // 조회
        System.out.println(studentScores.get("Kim"));
        System.out.println(studentScores.get("Lee"));

        // 수정
        studentScores.put("Park", 100);

        // 삭제
        studentScores.remove("Choi");
        System.out.println("Choi가 삭제되었는가?: "+studentScores.get("Choi"));
        System.out.println("Choi가 삭제되었는가?: "+studentScores.containsKey("Choi"));
        System.out.println("Choi가 삭제되었는가?: "+studentScores.containsValue(100));

        // 출력
        for(Map.Entry<String, Integer> entry:studentScores.entrySet()){
            System.out.println("student: "+entry.getKey()+"\nscore: "+entry.getValue());
        }
    }
}
