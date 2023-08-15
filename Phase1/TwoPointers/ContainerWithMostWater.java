package Phase1.TwoPointers;

import Utils.IOHandler;
import Utils.Converter;

public class ContainerWithMostWater {

    public static int area(int left, int right, int[] arr, int currentGreatest) {
        int lesser = Math.min(arr[left], arr[right]);
        int product = (right - left) * lesser;
        return Math.max(currentGreatest, product);
    }

    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int biggestArea = -1;
        while (left < right) {
            biggestArea = area(left, right, height, biggestArea);
            if (height[left] > height[right])
                right--;
            else {
                left++;
            }
        }
        return biggestArea;
    }

    public static void main(String[] args) {
        Integer[] arrInp = IOHandler.handleArrayInput(Integer.class);
        int arr[] = Converter.toPrimitive(arrInp);
        int sol = maxArea(arr);
        System.out.println(sol);
    }
}
