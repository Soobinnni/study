package part5.first.minmaxfinder;

// model: Utility Class
public class MinMaxFinder {
    private MinMaxFinder(){} // 생성자를 private으로 설정하여, instance생성을 막고 static멤버에만 접근하도록 한다.

    public static int findMin(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num < min) min = num;
        }

        return min;
    }

    public static int findMax(int[] nums){
        int max = nums[0];
        for(int i = 1;i<nums.length;i++){
            int num = nums[i];
            if (num > max) max = num;
        }

        return max;
    }
}