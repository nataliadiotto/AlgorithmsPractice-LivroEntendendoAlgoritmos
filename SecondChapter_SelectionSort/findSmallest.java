package SecondChapter_SelectionSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findSmallest {
    private static int findSmallest(List<Integer> arr) {
        int smallest = arr.get(0);
        int smallestIndex = 0;

        for (int i = 0; i <arr.size() ; i++) {
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(8, 7, 5, 2, 20, 15));
        System.out.println(findSmallest(arr));
    }
}
