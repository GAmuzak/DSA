package Phase1.ArraysAndStrings.Arrays;

public class NonDecreasing {

    public static boolean isPossible(int[] arr) {
		boolean changed = false;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<=arr[i+1]) continue;
            else {
                if(changed) return false;
                if(i==0 || arr[i+1]>=arr[i-1]){
                    arr[i]=arr[i+1];
                }
                else {
                    arr[i+1]=arr[i];
                }
                changed = true;
            }
        }
        return true;
	}

    public static void main(String[] args) {
        int[] arr = {1,4,1,2};
        boolean result = isPossible(arr);
        System.out.println(result);
    }
}
