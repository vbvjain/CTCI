package com.vbv;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CheckPermutations {
    public static void main(String[] args) {
        CheckPermutations checkPermutations = new CheckPermutations();
        String a = "abc";
        String b = "bca";
        boolean p =  checkPermutations.arePermutUsingSort(a,b);
        System.out.println(p);

    }

    private boolean arePermutUsingSort(String a, String b) {
        if (a.length()!=b.length()) return false;
        return sortString(a).equals(sortString(b));
    }

    private String sortString(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);

    }
}
