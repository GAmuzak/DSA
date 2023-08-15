package Phase1.AllTypes;

import java.util.ArrayList;
import Utils.IOHandler;

public class ZeroesToRight {

    public static void pushZerosAtEnd(ArrayList<Integer> arr) {
        int currentIdx = 0;
        int elementsAnalysed = 0;
        while(elementsAnalysed<arr.size()) {
            switch (arr.get(currentIdx)) {
                case 0:
                    arr.remove(currentIdx);
                    arr.add(0);
                    break;
                default:
                    currentIdx++;
                    break;
            }
            elementsAnalysed++;
        }
    }

    public static void main(String[] args) {
        Integer[] arrInp = IOHandler.handleArrayInput(Integer.class);
        ArrayList<Integer> arrList = IOHandler.arrayListInit(arrInp);
        pushZerosAtEnd(arrList);
        IOHandler.printArrayList(arrList);
    }
}
