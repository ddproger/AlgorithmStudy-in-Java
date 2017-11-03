package com.gerasymiuk.Algorithms.Chapter3;

import com.gerasymiuk.Algorithms.Chapter3.SortingServices.BubbleSort;
import com.gerasymiuk.Algorithms.Chapter3.SortingServices.InsertionSort;
import com.gerasymiuk.Algorithms.Chapter3.SortingServices.SelectionSorting;
import com.gerasymiuk.Algorithms.Chapter3.SortingServices.Sorting;

import java.util.*;

/**
 * Created by gerasymiuk on 30.10.17.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new LinkedList<>();
        for (int i = 0; i < 25; i++) {
            arrayList.add(new Integer(i));
            arrayList.add(new Integer(i));
        }
        Sorting<Integer> sorting = new SelectionSorting<>(true);
        sorting.sort(arrayList);
        System.out.println("Input Array\n"+arrayList);
        sorting = new BubbleSort<>();
        sorting.sort(arrayList);
        System.out.println("Sorted by Bubble Sorting Array\n"+arrayList);
        for (int i = 49; i >= 0; i--) {
            arrayList.add(new Integer(i));
        }
        System.out.println("Sorted Array with added 50 new elements\n"+arrayList);
        sorting = new InsertionSort<>(50);
        sorting.sort(arrayList);
        System.out.println("Sorted by Insertion Sorting Array\n"+arrayList);
    }
}
