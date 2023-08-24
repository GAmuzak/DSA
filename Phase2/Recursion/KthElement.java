package Phase2.Recursion;

import java.util.ArrayList;

import Utils.Converter;
import Utils.IOHandler;

public class KthElement {
    public static int findKthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int ctr1 = 0, ctr2 = 0, target = 0;
        k--;
        while (k >= 0) {
            if (ctr1 >= arr1.size()) {
                target = arr2.get(ctr2 + k);
                break;
            }
            if (ctr2 >= arr2.size()) {
                target = arr1.get(ctr1 + k);
                break;
            }
            if (arr1.get(ctr1) < arr2.get(ctr2)) {
                target = arr1.get(ctr1);
                ctr1++;
                k--;
            } else {
                target = arr2.get(ctr2);
                ctr2++;
                k--;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        int[] arr1 = { 7 };
        int[] arr2 = { 1 };
        ArrayList<Integer> arrList1 = IOHandler.arrayListInit(Converter.toObject(arr1));
        ArrayList<Integer> arrList2 = IOHandler.arrayListInit(Converter.toObject(arr2));
        int sol = findKthElement(arrList1, arrList2, 2);
        System.out.println(sol);
    }
}
