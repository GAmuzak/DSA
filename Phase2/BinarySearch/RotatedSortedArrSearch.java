package Phase2.BinarySearch;

public class RotatedSortedArrSearch {
    public static int search(int arr[], int key) {
        int left = 0, right = arr.length - 1, mid = 0;
        boolean inLeftHalf = false;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == key)
                return mid;
            inLeftHalf = false;
            if (arr[mid] >= arr[left])
                inLeftHalf = true;
            if (inLeftHalf) {
                if (key > arr[mid]) {
                    left = mid + 1;
                } else {
                    if (key < arr[left]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            } else {
                if (key < arr[mid]) {
                    right = mid - 1;
                } else {
                    if (key > arr[right]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 9, 4, 5, 6, 7 };
        int sol = search(arr, 6);
        System.out.println(sol);
    }
}
