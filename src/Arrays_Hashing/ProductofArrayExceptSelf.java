package Arrays_Hashing;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int temp = 1;
        answer[0] = temp;
        for (int i = 0; i < nums.length; i++) {
            answer[i] = temp;
            temp *= nums[i];
        }
        temp = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= temp;
            temp *= nums[i];
        }
        return answer;
    }
}
