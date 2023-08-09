package Utils;

public class PrimitiveObjectConverter {
    public static Integer[][] ConvertToObjectArray(int[][] arr) {
        Integer[][] result = new Integer[arr.length][];

        for (int i = 0; i < arr.length; i++) {
            result[i] = new Integer[arr[i].length];
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = arr[i][j];
            }
        }

        return result;
    }
    
    public static Integer[] ConvertToObjectArray(int[] arr) {
        Integer[] result = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }
    
    public static int[] convertToPrimitiveArray(Integer[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }
    
    public static int[][] convertToPrimitiveArray(Integer[][] arr) {
        int[][] result = new int[arr.length][];

        for (int i = 0; i < arr.length; i++) {
            result[i] = new int[arr[i].length];
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = arr[i][j];
            }
        }

        return result;
    }
    
    public static Character[] ConvertToObjectArray(char[] arr) {
        Character[] result = new Character[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }
    public static Character[][] ConvertToObjectArray(char[][] arr) {
        Character[][] result = new Character[arr.length][];

        for (int i = 0; i < arr.length; i++) {
            result[i] = new Character[arr[i].length];
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = arr[i][j];
            }
        }

        return result;
    }
    
    public static char[] convertToPrimitiveArray(Character[] arr) {
        char[] result = new char[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }


    public static char[][] convertToPrimitiveArray(Character[][] arr) {
        char[][] result = new char[arr.length][];

        for (int i = 0; i < arr.length; i++) {
            result[i] = new char[arr[i].length];
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = arr[i][j];
            }
        }

        return result;
    }
}
