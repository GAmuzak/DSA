package Phase2.AllTypes;

import java.util.ArrayList;
import java.util.Stack;

import Utils.IOHandler;

class HeightData {
    int idx;
    int height;

    HeightData(int idx, int height) {
        this.idx = idx;
        this.height = height;
    }
}

public class HistogramHeight {
    public static int largestRectangle(ArrayList<Integer> heights) {
        if (heights.size() == 0)
            return 0;
        if (heights.size() == 1)
            return heights.get(0);
        int maxArea = 0;
        Stack<HeightData> heightDataStack = new Stack<>();
        heightDataStack.add(new HeightData(0, heights.get(0)));
        for (int currIdx = 1; currIdx < heights.size(); currIdx++) {
            int currHeight = heights.get(currIdx);
            if (currHeight > heightDataStack.peek().height) {
                HeightData newHeight = new HeightData(currIdx, currHeight);
                heightDataStack.add(newHeight);
            } else {
                int lastPoppedIdx = heightDataStack.peek().idx;
                while (!(heightDataStack.isEmpty()) && currHeight < heightDataStack.peek().height) {
                    HeightData heightData = heightDataStack.pop();
                    int lastHeight = heightData.height;
                    lastPoppedIdx = heightData.idx;
                    int width = currIdx - lastPoppedIdx;
                    int area = width * lastHeight;
                    if (area > maxArea)
                        maxArea = area;
                }
                HeightData newHeight = new HeightData(lastPoppedIdx, currHeight);
                heightDataStack.add(newHeight);
            }
        }
        while (!heightDataStack.isEmpty()) {
            HeightData heightData = heightDataStack.pop();
            int lastHeight = heightData.height;
            int lastIdx = heightData.idx;
            int width = (heights.size()) - lastIdx;
            int area = width * lastHeight;
            System.out.println(lastHeight + " " + lastIdx + " " + width + " " + area);
            if (area > maxArea)
                maxArea = area;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Integer[] arr = IOHandler.handleArrayInput(Integer.class);
        ArrayList<Integer> arrInp = IOHandler.arrayListInit(arr);
        int max = largestRectangle(arrInp);
        System.out.println(max);
    }
}
