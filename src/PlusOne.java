import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        StringBuilder s = new StringBuilder();
        for (int a : digits) {
            s.append(a);
        }
        BigInteger rez = new BigInteger(String.valueOf(s));
        rez = rez.add(BigInteger.valueOf(1));
        String str = rez.toString();
        int[] rezArr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            rezArr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return rezArr;
    }
}

