package lesson3;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class TaskTwo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(6, 120, 4, 9, 11, 3, 45, 12, 464));
        System.out.println(removeEvenNum(list));
    }

    public static List<Integer> removeEvenNum (List<Integer> list ) {
        List<Integer> newList = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 == 0){
                newList.add(i);
            }
        }
        list.removeAll(newList);
        return list;
    }
}
