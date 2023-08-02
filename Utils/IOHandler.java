package Utils;

import java.util.Scanner;

public class IOHandler {
    @SuppressWarnings("resource")
    public static int[] handleArrayInput(){
        Scanner scanner = new Scanner(System.in);

        scanner.nextLine().trim(); //skip array length

        String array = scanner.nextLine();
        String[] splitVals = array.split(" ");
        int[] arr = new int[splitVals.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(splitVals[i]);
        }

        return arr;
    }

    public static void printArray(int[] arr){
        // System.out.print("\"");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i!=arr.length-1) System.out.print(" ");
        }
        // System.out.print("\"");
        System.out.println();
    }
}
