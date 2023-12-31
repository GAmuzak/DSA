package Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;

public class IOHandler {
    @SuppressWarnings("resource")
    public static <T> T[] handleArrayInput(Class<T> cType) {
        Scanner scanner = new Scanner(System.in);
        String array = scanner.nextLine();
        String[] splitVals = array.split(" ");
        @SuppressWarnings("unchecked")
        T[] arr = (T[]) java.lang.reflect.Array.newInstance(cType, splitVals.length);

        for (int i = 0; i < arr.length; i++) {
            try {
                arr[i] = cType.getConstructor(String.class).newInstance(splitVals[i]);
            } catch (ReflectiveOperationException | IllegalArgumentException e) {
                System.err.println("Error creating instance for element at index " + i + ": " + e.getMessage());
            }
        }

        return arr;
    }

    public static <T> void printArray(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1)
                System.out.print(" ");
        }
        System.out.println();
    }

    public static <T> void printArrayList(ArrayList<T> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
            if (i != arr.size() - 1)
                System.out.print(" ");
        }
        System.out.println();
    }

    public static <T> void print2dArrayList(ArrayList<ArrayList<T>> arr) {
        for (int i = 0; i < arr.size(); i++) {
            ArrayList<T> row = arr.get(i);
            for (int j = 0; j < row.size(); j++) {
                System.out.print(row.get(j));
                if (j != row.size() - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static <T> void print2dArray(T[][] arr) {
        for (T[] row : arr) {
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i]);
                if (i != row.length - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static <T> void printHashSet(Set<T> set) {
        for (T item : set) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static <K, V> void printHashMap(HashMap<K, V> map) {
        for (K key : map.keySet()) {
            System.out.print(key + ":" + map.get(key) + "; ");
        }
        System.out.println();
    }

    public static <T> ArrayList<T> arrayListInit(T[] arr) {
        ArrayList<T> arList = new ArrayList<T>();
        for (int i = 0; i < arr.length; i++) {
            arList.add(arr[i]);
        }
        return arList;
    }

    public static <T> ArrayList<ArrayList<T>> arrayList2DInit(T[][] arr) {
        ArrayList<ArrayList<T>> arList2D = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            ArrayList<T> rowList = new ArrayList<>();
            for (int j = 0; j < arr[i].length; j++) {
                rowList.add(arr[i][j]);
            }
            arList2D.add(rowList);
        }
        return arList2D;
    }
}
