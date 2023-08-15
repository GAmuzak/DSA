package Phase1.ArraysAndStrings.Arrays;

import java.util.Arrays;
import java.util.Scanner;

import Utils.IOHandler;
import Utils.Converter;

public class RotateArray {

    public static int[] Rotate(int[] arr, int k) {
        int[] rotatedArray = new int[arr.length];

        int[] leftPart = Arrays.copyOfRange(arr, k, arr.length);
        int[] rightPart = Arrays.copyOfRange(arr, 0, k);

        System.arraycopy(leftPart, 0, rotatedArray, 0, leftPart.length);
        System.arraycopy(rightPart, 0, rotatedArray, leftPart.length, rightPart.length);

        return rotatedArray;
    }

    public static void main(String[] args) {

        Integer[] arr = IOHandler.handleArrayInput(Integer.class);

        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int k = Integer.parseInt(num);
        scanner.close();

        int[] intArray = Converter.toPrimitive(arr);

        int[] rotatedArray = Rotate(intArray, k);

        Integer[] finalArr = Converter.toObject(rotatedArray);

        IOHandler.printArray(finalArr);
    }
}
