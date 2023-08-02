package Phase1.ArraysAndStrings;

import java.util.Scanner;

import Utils.IOHandler;

public class RotateArray {

    public static int[] Rotate(int[]arr, int k){
        int[] rotatedArray = new int[arr.length];

        

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
