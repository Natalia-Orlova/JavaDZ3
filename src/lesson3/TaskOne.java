package lesson3;

import java.util.List;
import java.util.ArrayList;

public class TaskOne {

    private static char[] arr;
    private static List<Integer> indexes;
    public static List<List<Integer>> ans;
    public static void main(String[] args) {

        String s = "5? + ?2 = 99".replaceAll(" ","");
        char[] arr = s.toCharArray();

        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '?') {
                indexes.add (i);
            }
        }
        System.out.println(arr);
        System.out.println(indexes);

        int k = indexes.size();
    }
        //List<List<Integer>> ans;
        public List<List<Integer>> combine(int k) {
            ans = new ArrayList<>();
            helper(new ArrayList<>(), k);
            return ans;
        }

        private void helper (List<Integer> comb, int k){
        if (comb.size() == k) {
            ans.add(new ArrayList<>(comb));
            return;
        }

        for (int i = 0; i <= 9; i++) {
            comb.add(i);
            helper(comb, k);
            comb.remove(comb.size() - 1);
        }
    }
}

