package Phase1.ArraysAndStrings;

import java.lang.Math;

import Utils.IOHandler;



public class SmallestPositiveInt {
    public static int firstMissing(int[] arr) {
        int missingNum = arr.length+1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0) arr[i]=0;
        }
        for (int i = 0; i < arr.length; i++) {
            int targetIndex = Math.abs(arr[i]) - 1;
            if(targetIndex<0 || targetIndex> arr.length-1) continue;
            if(arr[targetIndex]>0) arr[targetIndex]*=-1;
            else if(arr[targetIndex]==0) arr[targetIndex] = -1*(arr.length+1);
        }
        IOHandler.printArray(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0) {
                missingNum = i+1; break;
            }
        }		
        return missingNum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0};
        int index = firstMissing(arr);
        System.out.println(index);
    }
}
