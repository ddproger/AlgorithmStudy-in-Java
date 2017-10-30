package com.gerasymiuk.Algorithms.Chapter3;

import com.gerasymiuk.Algorithms.Chapter3.SortingServices.BubbleSort;
import com.gerasymiuk.Algorithms.Chapter3.SortingServices.Sorting;

import java.util.*;

/**
 * Created by gerasymiuk on 30.10.17.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new LinkedList<>();
        for (int i = 49; i >= 0; i--) {
            arrayList.add(new Integer(i));
        }
        System.out.println(arrayList);
        Sorting<Integer> sorting = new BubbleSort<>();
        sorting.sort(arrayList);
        System.out.println(arrayList);
    }
}
