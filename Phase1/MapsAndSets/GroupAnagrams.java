package Phase1.MapsAndSets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Utils.IOHandler;

public class GroupAnagrams {
    public static ArrayList<ArrayList<String>> getGroupedAnagrams(ArrayList<String> inputStr, int n) {
        ArrayList<ArrayList<String>> anagramGroups = new ArrayList<>();
        
        Map<ArrayList<Integer>, ArrayList<String>> map = new HashMap<>();

        for (int i = 0; i < inputStr.size(); i++) {
            ArrayList<Integer> letterFreq = new ArrayList<>(26);
            for (int j = 0; j < 26; j++) {
                letterFreq.add(0);
            }
            String word = inputStr.get(i);
            for (int j = 0; j < word.length(); j++) {
                int index = word.charAt(j) - 'a';
                int updatedCount = letterFreq.get(index) + 1;
                letterFreq.set(index, updatedCount);
            }
            if (map.containsKey(letterFreq)) {
                map.get(letterFreq).add(word);
            }
            else {
                ArrayList<String> newWordList = new ArrayList<>();
                newWordList.add(word);
                map.put(letterFreq, newWordList);
            }
        }
        
        for (Map.Entry<ArrayList<Integer>, ArrayList<String>> entry : map.entrySet()) {
            ArrayList<String> group = entry.getValue();
            anagramGroups.add(group);
        }
        return anagramGroups;
    }
    
    public static void main(String[] args) {
        String[] words = IOHandler.handleArrayInput(String.class);
        ArrayList<String> wordList = IOHandler.arrayListInit(words);
        ArrayList<ArrayList<String>> anagrams = getGroupedAnagrams(wordList, 0);
        IOHandler.print2dArrayList(anagrams);
    }
}
