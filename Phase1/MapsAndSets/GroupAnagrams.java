package Phase1.MapsAndSets;

import java.util.ArrayList;

import Utils.IOHandler;

public class GroupAnagrams {
    public static ArrayList<ArrayList<String>> getGroupedAnagrams(ArrayList<String> inputStr, int n) {
        ArrayList<ArrayList<String>> anagramGroups = new ArrayList<>();
        
        return anagramGroups;
    }
    
    public static void main(String[] args) {
        String[] words = IOHandler.handleArrayInput(String.class);
        ArrayList<String> wordList = IOHandler.arrayListInit(words);
        ArrayList<ArrayList<String>> anagrams = getGroupedAnagrams(wordList, 0);
        IOHandler.print2dArrayList(anagrams);
    }
}
