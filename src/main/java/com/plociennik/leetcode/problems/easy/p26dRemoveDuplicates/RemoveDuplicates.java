package com.plociennik.leetcode.problems.easy.p26dRemoveDuplicates;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println(removeDuplicates(new int[] {1,1,2}));
        System.out.println(removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
        System.out.println(removeDuplicates(new int[] {-3,-1,0,0,0,3,3}));

    }

    public static int removeDuplicates(int[] nums) {

        Set<Integer> distincts = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            distincts.add(nums[i]);
        }

        Set<Integer> sorted = distincts.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));
        int index = 0;
        for (Integer distinct : sorted) {
            nums[index] = distinct;
            index++;
        }

        return distincts.size();
    }
}
