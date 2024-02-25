package part6.generic.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

interface FilterEven{
    boolean isEven(int n);
}


public class ArrayStreamEx {
    public static boolean isEvenStatic(int n){
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // 객체 n의 조건자 boolean값을 반환하는 함수형 인터페이스
        Predicate<Integer> isEven = n -> n%2 == 0;
        FilterEven fe = n -> n%2 == 0;

        int sumOfsquares = numbers.stream()
                        .filter(isEven) // 짝수 스트림 필터
                .filter(fe::isEven) // 짝수 스트림 필터
                .filter(ArrayStreamEx::isEvenStatic) // 짝수 스트림 필터
                                            .sorted()       // 스트림 정렬
                                            .map(n->n*n)    // 모든 원소를 제곱함
                                            .reduce(0, Integer::sum); // 초기값 0에 원소들을 순차적으로 더함(누적합)
        System.out.println("짝수 제곱의 합: "+sumOfsquares);
    }
}
