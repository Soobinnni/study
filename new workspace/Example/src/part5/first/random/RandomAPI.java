package part5.first.random;

import java.util.Random;
public class RandomAPI {
    // Random클래스를 이용하여 6개의 난수를 중복되지 않게 저장하기
    /*  자료형 -> int배열
        방법
     1. Random하게 범위의 수를 뽑는 것은 java.util.Random 클래스를 이용한다.
     2. 중복의 검사는 랜덤으로 뽑힌 수가 들어갈 index자리 전까지의 수 중에서 랜덤으로 뽑힌 수와 중복되는 지 검사 후,
        중복되지 않으면 해당 index에 수를 넣는다. */

    public static void main(String[] args) {
        printNotDuplicateRandomSixArr();
    }

    public static void printNotDuplicateRandomSixArr(){
        int[] nums = getNotDuplicateRandomSixArr();
        String notDuplicateRandomSixStr = getNotDuplicateRandomSixStr(nums);
        System.out.println(notDuplicateRandomSixStr);
    }

    public static int[] getNotDuplicateRandomSixArr(){
        int i = 0;
        int arrLength = 6;
        int[] nums = new int[arrLength];
        int num;
        boolean duplicate;
        Random r = new Random(45);

        while(i<arrLength){
            duplicate = false;
            num = r.nextInt(45)+1; // Random().nextInt의 인자 값이 n일 때, 0이상 n미만의 수를 반환.
            for(int j=0;j<i;j++){
                if(num==nums[j]){
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate) nums[i++] = num; // 후위 연산자이므로 나중에 더함
        }

        return nums;
    }

    public static String getNotDuplicateRandomSixStr(int[] nums) {
        String str = "[";
        for (int n : nums) {
            str += n + " ";
        }
        str = str.strip();
        str += "]";

        return str;
    }
}
