package TwoPointers;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] heigth = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(heigth));
    }

    public static int trap(int[] height) {
        int result = 0;
        int maxIndex = 0;
        int max = height[0];
        int maxLeft = height[0];
        int maxRight = height[height.length - 1];
        for (int i = 1; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
                maxIndex = i;
            }
        }
        for (int i = 1; i < maxIndex; i++) {
            if (height[i] < maxLeft)
                result += maxLeft - height[i];
            else maxLeft = height[i];
        }
        for (int i = height.length - 1; i > maxIndex; i--) {
            if (height[i] < maxRight)
                result += maxRight - height[i];
            else maxRight = height[i];
        }
        return result;
    }
}
