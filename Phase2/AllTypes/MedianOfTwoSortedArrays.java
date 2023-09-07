package Phase2.AllTypes;

import Utils.Converter;
import Utils.IOHandler;

public class MedianOfTwoSortedArrays {
    public static double median(int[] a, int[] b) {
        int totalSize = a.length + b.length;
        int maincounter = 0, aCounter = 0, bCounter = 0;
        boolean evenTotalCount = totalSize % 2 == 0;
        int halfMark = evenTotalCount ? totalSize / 2 - 1 : totalSize / 2;
        while (maincounter < halfMark) {
            if (aCounter >= a.length)
                bCounter++;
            else if (bCounter >= b.length)
                aCounter++;
            else {
                if (a[aCounter] > b[bCounter])
                    bCounter++;
                else
                    aCounter++;
            }
            maincounter++;
        }
        if (!evenTotalCount) {
            if (aCounter >= a.length)
                return (double) b[bCounter];
            else if (bCounter >= b.length)
                return (double) a[aCounter];
            else {
                if (a[aCounter] > b[bCounter])
                    return (double) b[bCounter];
                else
                    return (double) a[aCounter];
            }
        } else {
            int firstElement = 0, secondElement = 0;
            if (aCounter >= a.length) {
                firstElement = b[bCounter];
                bCounter++;
            } else if (bCounter >= b.length) {
                firstElement = a[aCounter];
                aCounter++;
            } else {
                if (a[aCounter] > b[bCounter]) {
                    firstElement = b[bCounter];
                    bCounter++;
                } else {
                    firstElement = a[aCounter];
                    aCounter++;
                }
            }
            if (aCounter >= a.length)
                secondElement = b[bCounter];
            else if (bCounter >= b.length)
                secondElement = a[aCounter];
            else {
                if (a[aCounter] > b[bCounter])
                    secondElement = b[bCounter];
                else
                    secondElement = a[aCounter];
            }
            double sol = ((double) firstElement + (double) secondElement) / 2;
            return sol;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = Converter.toPrimitive(IOHandler.handleArrayInput(Integer.class));
        int[] arr2 = Converter.toPrimitive(IOHandler.handleArrayInput(Integer.class));
        double sol = median(arr1, arr2);
        System.out.println(sol);
    }
}
