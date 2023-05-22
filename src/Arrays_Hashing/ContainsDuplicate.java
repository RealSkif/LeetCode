package Arrays_Hashing;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return set.size() < nums.length;
    }
}
