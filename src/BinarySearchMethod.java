public class BinarySearchMethod {
    static int binarySearch(int[] arrays, int key) {
        int low = 0;
        int high = arrays.length - 1;
        while (high >= low) {
            int mid = ((low + high) / 2);
            if (key < arrays[mid]) {
                high = mid - 1;
            } else if (key == arrays[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
            return -1;

    }


}
