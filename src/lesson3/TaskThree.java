package lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TaskThree {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 6, 8, 4, 9, 2, 3, 45, 12, 464));
        System.out.println("Минимальное значение: " + getMin(list));
        System.out.println("Максимальное значение: " + getMax(list));
    }

    public static int getMin(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (Integer i : list) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    public static int getMax(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (Integer i : list) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}
