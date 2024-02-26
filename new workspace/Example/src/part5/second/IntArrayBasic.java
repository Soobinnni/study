package part5.second;

import java.util.Random;

public class IntArrayBasic {
    public static void main(String[] args) {
        IntArray a = new IntArray();
        int index = 0;
        int goalIndex = 8;
        Random r = new Random();
        while(index<goalIndex){
            int num = r.nextInt(120) + 1;
            int[] arr = a.getArr();
            boolean duplicate = false;
            for(int i = 0;i<index;i++){
                if(num==arr[i]){
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate) {
                a.add(num);
                index++;
            }
        }

        System.out.println(a);
    }
}
