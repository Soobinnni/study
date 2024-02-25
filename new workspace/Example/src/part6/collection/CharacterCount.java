package part6.collection;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] charArray = str.toCharArray();
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        
        for(char c:charArray){
            int value = 1;
            if(charCountMap.containsKey(c)) value = charCountMap.get(c) + 1;
            
            charCountMap.put(c, value);
        }
        
        for(Map.Entry<Character, Integer> entry:charCountMap.entrySet()){
            System.out.println(entry.getKey()+"의 개수는 "+entry.getValue()+"개");
        }
    }
}
