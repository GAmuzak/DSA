package Phase1.BasicAlgorithms;

import Utils.IOHandler;
import Utils.Converter;

public class MooresAlgorithm {
    public static int findMajority(int[] arr, int n) {
        int maj = 0;
        int majCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maj == arr[i])
                majCount++;
            else {
                if (majCount == 0) {
                    maj = arr[i];
                    majCount++;
                } else {
                    majCount--;
                }
            }
        }
        majCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maj)
                majCount++;
        }
        if (majCount > n / 2)
            return maj;
        else
            return -1;
    }

    public static void main(String[] args) {
        Integer[] arrInp = IOHandler.handleArrayInput(Integer.class);
        int[] arr = Converter.toPrimitive(arrInp);
        int sol = findMajority(arr, arr.length);
        System.out.println(sol);
    }

}
