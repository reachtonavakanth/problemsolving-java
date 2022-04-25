package frequentquestions;

import java.util.*;

public class CommonElementsInArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 0, 5, 8, 9, 9, 2, 5, 2, 1, 2, 2};
        int[] arr2 = {0, 7, 6, 3, 24, 1};
        getCommonElement(arr1, arr2);
    }

    public static void getCommonElement(int[] arr1, int[] arr2) {
        Set<Integer> li = new HashSet<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    li.add(arr1[i]);
                }
            }
        }
        for (Iterator<Integer> it = li.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }

    }
}
