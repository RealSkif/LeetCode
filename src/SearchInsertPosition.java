public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i+1< nums.length & target > nums[i] && target < nums[i+1]) index = i+1;
            else if (target > nums[nums.length - 1])
                index = nums.length;
            else if (nums[i] == target) index = i;
        }
        return index;
    }
}
