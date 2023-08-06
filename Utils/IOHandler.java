package Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class IOHandler {
    @SuppressWarnings("resource")
    public static int[] handleArrayInput(){
        Scanner scanner = new Scanner(System.in);

        scanner.nextLine().trim();

        String array = scanner.nextLine();
        String[] splitVals = array.split(" ");
        int[] arr = new int[splitVals.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(splitVals[i]);
        }

        return arr;
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i!=arr.length-1) System.out.print(" ");
        }
        System.out.println();
    }

    public static void printArrayList(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
            if(i!=arr.size()-1) System.out.print(" ");
        }
        System.out.println();
    }

    public static void print2dArray(int[][] arr){
        for (int[] row : arr) {
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i]);
                if(i!=row.length-1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
