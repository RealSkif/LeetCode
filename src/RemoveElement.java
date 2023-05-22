import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {

    }

    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int a : nums) {
            if (a != val)
                arr.add(a);
        }
        int x = 0;
        for (int a : arr) {
            nums[x++] = a;
        }
        return arr.size();
    }

}
