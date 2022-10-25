package iterator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// list라는 arrayList를 다람쥐, 개구리, 나비의 데이터로 배열로 변환
		Collection<String> list = Arrays.asList("다람쥐","개구리","나비");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"-");
		}
		System.out.println("\n");
		
		//한번 전체 순환된 반복기는 더이상 next()를 끌어올 수 없다.
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//따라서 새로 생성
		Iterator<String> itrSecond = list.iterator();
		while (itrSecond.hasNext()) {
			System.out.println(itrSecond.next());
			
			
		}
		
	}

}
