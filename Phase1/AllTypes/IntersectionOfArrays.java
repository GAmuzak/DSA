package Phase1.AllTypes;

import java.util.ArrayList;
import Utils.IOHandler;

public class IntersectionOfArrays {

    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m) {
        ArrayList<Integer> common = new ArrayList<>();
        int arr1Idx = 0, arr2Idx = 0;
        while (arr1Idx < n && arr2Idx < m) {
            int ar1Val = arr1.get(arr1Idx);
            int ar2Val = arr2.get(arr2Idx);
            if (ar1Val == ar2Val) {
                common.add(ar1Val);
                arr1Idx++;
                arr2Idx++;
            }
            else if (ar1Val > ar2Val) {
                arr2Idx++;

            }
            else {
                arr1Idx++;
            }
        }
        return common;
    }

    public static void main(String[] args) {
        Integer[] a1 = IOHandler.handleArrayInput(Integer.class);
        Integer[] a2 = IOHandler.handleArrayInput(Integer.class);
        ArrayList<Integer> arr1 = IOHandler.arrayListInit(a1);
        ArrayList<Integer> arr2 = IOHandler.arrayListInit(a2);
        ArrayList<Integer> common = findArrayIntersection(arr1, arr1.size(), arr2, arr2.size());
        IOHandler.printArrayList(common);
    }
}
