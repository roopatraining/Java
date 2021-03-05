package Arrayslist;


import java.util.ArrayList;
import java.util.List;

public class largestProductOfTwoNumbers {

    public static void main(String[] args) {
        int result = 0;
        int a[] = { -22, -5, 12, 6, 3, 4, 9, -11, 4, 5, 6, 8, 7, 7 };
        int max = 0;

        int curr = 0;
        List<Integer> list = new ArrayList();

        for (int i = 0; i < a.length - 1; i++) {

            curr = a[i] * a[i + 1];
            list.add(curr);

        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }

        }
        System.out.println(max);
    }
} 