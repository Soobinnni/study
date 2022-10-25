package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		//String배열 생성
		ArrayList<String> animal = new ArrayList<>();
		String[] animals1 = {"aaa","dddd","호랑이","바다표범","곰"};
		String[] animals3 = animal.toArray(animals1);
		System.out.println(animals3[0]);
		for (String string : animals3) {
			System.out.println(string);
		}
		
	}

}
