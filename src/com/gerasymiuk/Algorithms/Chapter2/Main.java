package com.gerasymiuk.Algorithms.Chapter2;

import com.gerasymiuk.Algorithms.Chapter2.SearchServices.BinarySearch;
import com.gerasymiuk.Algorithms.Chapter2.SearchServices.LinearSearch;

import java.util.TreeSet;

/**
 * Created by gerasymiuk on 30.10.17.
 */
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < 100; i+=2) {
            treeSet.add(new Integer(i));
        }
        System.out.println("Collection: ");
        System.out.println(treeSet.toString());
        System.out.println(new LinearSearch<>(treeSet).getIndex(12));
        System.out.println(new BinarySearch<>(treeSet).getIndex(12));

    }
}
