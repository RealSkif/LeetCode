package TwoPointers;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(numbers, 9)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = numbers.length-1;;
        while(left != right){
           if(numbers[left] + numbers[right] == target) {
               result[0] = ++left;
               result[1] = ++ right;
               break;
           }
           if(numbers[left] + numbers[right] > target)
               right--;
           else left++;
        }
        return result;
    }
}
