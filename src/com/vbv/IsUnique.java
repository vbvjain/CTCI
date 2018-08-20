package com.vbv;

import java.util.Hashtable;
import java.util.Set;

public class IsUnique {
    public static void main(String[] args) {
        String s = "ddddddddd";
        IsUnique iU = new IsUnique();
        boolean isUniqueUsingHT = iU.containsUniqueWithHashTable(s);
        System.out.println(isUniqueUsingHT);
    }


    private boolean containsUniqueWithHashTable(String s) {
        Hashtable<Character,Integer> uniqueHT = new Hashtable();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            putVal(uniqueHT, key);
        }
        Set<Character> keys = uniqueHT.keySet();
        for(Character key: keys){
            if (multipleOccurenceFound(uniqueHT, key)){
                return true;
            }
        }
        return false;
    }

    private boolean multipleOccurenceFound(Hashtable<Character, Integer> uniqueHT, Character key) {
        return uniqueHT.get(key)>1;
    }

    private void putVal(Hashtable<Character, Integer> uniqueHT, char key) {
        Integer val = uniqueHT.getOrDefault(key, 0);
        if(val ==0){
            uniqueHT.put(key,1);
        }else{
            uniqueHT.put(key,val+1);
        }
    }


}
