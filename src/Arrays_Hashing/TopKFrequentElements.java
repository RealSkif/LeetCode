package Arrays_Hashing;

import com.sun.tools.javac.Main;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : nums) {
            if (map.containsKey(a))
                map.put(a, map.get(a) + 1);
            else map.put(a, 1);
        }
        List<Map.Entry<Integer, Integer>> ls = new ArrayList<>(map.entrySet());
        ls.sort(Comparator.comparingInt(Map.Entry::getValue));
        for (int i = 0; i < k; i++) {
            res[i] = ls.get(ls.size() - i - 1).getKey();
        }
        return res;
    }
}
