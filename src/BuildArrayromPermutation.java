public class BuildArrayromPermutation {
    public int[] buildArray(int[] nums) {

//        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[nums[i]]; // 0 1 2 3 4 5
        }
        return nums;
    }
}
