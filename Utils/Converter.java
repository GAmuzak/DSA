package Utils;

public class Converter {
    public static Integer[][] toObject(int[][] arr) {
        Integer[][] result = new Integer[arr.length][];

        for (int i = 0; i < arr.length; i++) {
            result[i] = new Integer[arr[i].length];
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = arr[i][j];
            }
        }

        return result;
    }

    public static Integer[] toObject(int[] arr) {
        Integer[] result = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }

    public static int[] toPrimitive(Integer[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }

    public static int[][] toPrimitive(Integer[][] arr) {
        int[][] result = new int[arr.length][];

        for (int i = 0; i < arr.length; i++) {
            result[i] = new int[arr[i].length];
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = arr[i][j];
            }
        }

        return result;
    }

    public static Character[] toObject(char[] arr) {
        Character[] result = new Character[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }

    public static Character[][] toObject(char[][] arr) {
        Character[][] result = new Character[arr.length][];

        for (int i = 0; i < arr.length; i++) {
            result[i] = new Character[arr[i].length];
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = arr[i][j];
            }
        }

        return result;
    }

    public static char[] toPrimitive(Character[] arr) {
        char[] result = new char[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }

    public static char[][] toPrimitive(Character[][] arr) {
        char[][] result = new char[arr.length][];

        for (int i = 0; i < arr.length; i++) {
            result[i] = new char[arr[i].length];
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = arr[i][j];
            }
        }

        return result;
    }

    public static Short[] toObject(short[] arr) {
        Short[] result = new Short[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }

    public static short[] toPrimitive(Short[] arr) {
        short[] result = new short[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }

    public static Long[] toObject(long[] arr) {
        Long[] result = new Long[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }

    public static long[] toPrimitive(Long[] arr) {
        long[] result = new long[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }

    public static Float[] toObject(float[] arr) {
        Float[] result = new Float[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }

    public static float[] toPrimitive(Float[] arr) {
        float[] result = new float[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }

    public static Double[] toObject(double[] arr) {
        Double[] result = new Double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }

    public static double[] toPrimitive(Double[] arr) {
        double[] result = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }

}
