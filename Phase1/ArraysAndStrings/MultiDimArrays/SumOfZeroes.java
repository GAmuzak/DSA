package Phase1.ArraysAndStrings.MultiDimArrays;

import java.util.ArrayList;

public class SumOfZeroes {

    public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {
        int ctr = 0;
        for (int i = 0; i < mat.size(); i++) {
            for (int j = 0; j < mat.get(i).size(); j++) {
                if(mat.get(i).get(j)==0){
                    if(i>0){
                        ctr+=mat.get(i-1).get(j);
                    }
                    if(i<mat.size()-1){
                        ctr+=mat.get(i+1).get(j);
                    }
                    if(j>0){
                        ctr+=mat.get(i).get(j-1);
                    }
                    if(j<mat.get(i).size()-1){
                        ctr+=mat.get(i).get(j+1);
                    }
                }
            }
        }
		return ctr;
	}


    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> twoDArrayList = new ArrayList<>();

        twoDArrayList.add(new ArrayList<Integer>());
        twoDArrayList.get(0).add(0);
        twoDArrayList.get(0).add(0);
        twoDArrayList.get(0).add(1);

        twoDArrayList.add(new ArrayList<Integer>());
        twoDArrayList.get(1).add(0);
        twoDArrayList.get(1).add(0);
        twoDArrayList.get(1).add(1);

        for (int i = 0; i < twoDArrayList.size(); i++) {
            for (int j = 0; j < twoDArrayList.get(i).size(); j++) {
                System.out.print(twoDArrayList.get(i).get(j) + " ");
            }
            System.out.println();
        }

        int result = coverageOfMatrix(twoDArrayList);
        System.out.println(result);
    }
}
