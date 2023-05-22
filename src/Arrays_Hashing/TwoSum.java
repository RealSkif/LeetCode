package Arrays_Hashing;

public class TwoSum {
    public  int[] twoSum(int[] nums, int target) {
        int[] rez = new int[2];
        int a = nums[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    {
                        rez[0] = i;
                        rez[1] = j;
                        break;
                    }
                }
            }
        }
        return rez;
    }
}
