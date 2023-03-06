package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.List;

public class PivotInList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(12);
        list.add(18);
        list.add(4);
        list.add(10);
        int ans = findPivot(list);
        System.out.println(ans);
    }

    public static int findPivot(List<Integer> list) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < list.size(); i++) {
            sumRight += list.get(i);
        }
        for (int i = 0; i < list.size(); i++) {
            sumRight -= list.get(i);
            if (sumLeft == sumRight) {
                return i;
            }
            sumLeft += list.get(i);
        }
        return -1;
    }
}
