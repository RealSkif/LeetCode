package Arrays_Hashing;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class LongestSequence {
    public static void main(String[] args) {
        int[] nums = {4, 0, -4, -2, 2, 5, 2, 0, -8, -8, -8, -8, -1, 7, 4, 5, 5, -4, 6, 6, -3};
        System.out.println(longestConsecutive(nums));

    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        int length = 1;
        int res = 1;
        int temp = nums[0];
        Set<Integer> set = new TreeSet<>();
        for (int a : nums) {
            set.add(a);
            if (a < temp)
                temp = a;
        }
        System.out.println(set);
        for (Integer a : set) {
            if (a - temp == 1) {
                length++;
                if (length > res)
                    res = length;
            } else length = 1;
            temp = a;
        }
        return res;
    }
}
