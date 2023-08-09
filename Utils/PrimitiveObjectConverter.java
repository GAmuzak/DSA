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

    public static Short[] convertToShortArray(short[] arr) {
    Short[] result = new Short[arr.length];

    for (int i = 0; i < arr.length; i++) {
        result[i] = arr[i];
    }

    return result;
    }

    public static short[] convertToPrimitiveArray(Short[] arr) {
        short[] result = new short[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }

    public static Long[] convertToLongArray(long[] arr) {
    Long[] result = new Long[arr.length];

    for (int i = 0; i < arr.length; i++) {
        result[i] = arr[i];
    }

    return result;
    }

    public static long[] convertToPrimitiveArray(Long[] arr) {
        long[] result = new long[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }

    public static Float[] convertToFloatArray(float[] arr) {
    Float[] result = new Float[arr.length];

    for (int i = 0; i < arr.length; i++) {
        result[i] = arr[i];
    }

    return result;
    }

    public static float[] convertToPrimitiveArray(Float[] arr) {
        float[] result = new float[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }
    public static Double[] convertToDoubleArray(double[] arr) {
    Double[] result = new Double[arr.length];

    for (int i = 0; i < arr.length; i++) {
        result[i] = arr[i];
    }

    return result;
    }

    public static double[] convertToPrimitiveArray(Double[] arr) {
        double[] result = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }

}
