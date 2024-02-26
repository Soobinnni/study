package part6.collection;
import java.util.*;
public class ListBasic {
    public static void main(String[] args) {

        List<Movie> list = new ArrayList<>();
        Movie movie1 = new Movie("괴물", "봉준호", 2006, "대한민국");
        Movie movie2 = new Movie("기생충", "봉준호", 2019, "대한민국");
        Movie movie3 = new Movie("완벽한 타인", "이재규", 2018, "대한민국");
        Movie movie4 = new Movie("파묘", "장재현", 2024, "대한민국");

        // 추가 [movie1, movie2, movie3]
        list.add(movie1);
        list.add(movie2);
        list.add(movie3);

        // 수정 [movie1, movie4, movie3]
        list.set(1, movie4);
        for (Movie m : list) System.out.println(m.getTitle());

        // 삭제 [movie1, movie4]
        list.remove(2);
        for (Movie m : list) System.out.println(m.getTitle());

        // ArrayList에서 Movie객체 검색
        String targetTitle = "파묘";
        for (Movie m : list) {
            if (targetTitle.equals(m.getTitle()))
                System.out.println("찾았다!" + targetTitle + " 감독:" + m.getDirector() + ", 개봉년도: " + m.getYear() + ", 국가: " + m.getCountry());
        }

        System.out.print(list.get(list.size() - 1));

        // 요소 찾기
        System.out.println(list.contains(movie2));


        // 요소 비우기
        list.clear();

        // 요소가 들어있는지 확인
        System.out.println(list.isEmpty());
    }
}