package FirstChapter_BinarySearch;

public class BinarySearch {
    private static Integer binarySearch (int[] list, int item) {
        //this function returns the index of the chosen item
        int low = 0;
        int high = list.length -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];
            if (guess == item) {
                return mid;
            }
            if (guess > item) { //if guess is too high, update the variable accordingly
                high = mid - 1;
            } else { //if guess is too low, update the variable accordingly
                low = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] myList = {1, 2, 3, 5, 7, 9};

        System.out.println(binarySearch(myList, 3)); //1
        System.out.println(binarySearch(myList, 9));
        System.out.println(binarySearch(myList, -1)); //null
    }
}
