package Stack;

import java.util.Arrays;

public class CarFleet {
    public static void main(String[] args) {
        int target = 12;
        int[] position = {10, 8, 0, 5, 3}; // 0-1; 3-3, 5-1, 8-4, 10-2
        int[] speed = {2, 4, 1, 1, 3};
        System.out.println(carFleet(target, position, speed));
    }


    public static int carFleet(int target, int[] position, int[] speed) {
        int carFleet = 0;
        double [] [] time = new double[position.length][];
        for (int i = 0; i < position.length; i++) {
            time[i][] = (double) (target - position[i]) /speed[i];
        }
//        Arrays.sort(time);
        System.out.println(time);
        return carFleet;
    }
}
