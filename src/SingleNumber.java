import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 1, 2, 1, 2}; //1,1,2,2,4
        int rez = singleNumber(nums);
        System.out.println(rez);
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        AtomicInteger rez = new AtomicInteger();
        for (int num : nums) {
            map.putIfAbsent(num, 0);
            map.computeIfPresent(num, (a, b) -> b + 1);
        }
        map.forEach((a, b) -> System.out.println("key: " + a + " value: " + b));
        map.forEach((a, b) -> {
            if (b == 1) rez.set(a);
        });
        return rez.get();
    }
}