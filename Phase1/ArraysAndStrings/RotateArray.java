package Phase1.ArraysAndStrings;

import java.util.Arrays;
import java.util.Scanner;

import Utils.IOHandler;

public class RotateArray {

    public static int[] Rotate(int[]arr, int k){
        int[] rotatedArray = new int[arr.length];

        int[] leftPart = Arrays.copyOfRange(arr, k, arr.length);
        int[] rightPart = Arrays.copyOfRange(arr, 0, k);

        System.arraycopy(leftPart, 0, rotatedArray, 0, leftPart.length);
        System.arraycopy(rightPart, 0, rotatedArray, leftPart.length, rightPart.length);

        return rotatedArray;
    }

    public static void main(String[] args) {

        int[] arr = IOHandler.handleArrayInput();

        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int k = Integer.parseInt(num);
        scanner.close();
        
        int[] rotatedArray = Rotate(arr,k);

        IOHandler.printArray(rotatedArray);
    }
}
