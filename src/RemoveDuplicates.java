
import java.util.Arrays;
import java.util.TreeSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int a : nums) {
            set.add(a);
        }
        Arrays.fill(nums, 0);
        int x = 0;
        for (int a : set) {
            nums[x++] = a;
        }
        return set.size();
    }
}
