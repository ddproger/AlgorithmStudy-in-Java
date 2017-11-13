package com.gerasymiuk.Algorithms.Chapter3;

import com.gerasymiuk.Algorithms.Chapter3.SortingServices.*;

import java.util.*;

/**
 * Created by gerasymiuk on 30.10.17.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new LinkedList<>();
        for (int i = 25; i >= 0; i--) {
            arrayList.add(new Integer(i));
            //arrayList.add(new Integer(i));
        }
        System.out.println("Input Array\n"+arrayList);
        Sorting<Integer> sorting = new ShellSort<>();
        sorting.sort(arrayList);
        System.out.println("Sorting with ShellSort\n"+arrayList);
        sorting = new SelectionSorting<>(true);
        sorting.sort(arrayList);
        System.out.println("Revers sorting with Selection Sorting\n"+arrayList);
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

        sorting = new SelectionSorting<>(true);
        sorting.sort(arrayList);
        System.out.println("Revers sorting with Selection Sorting\n"+arrayList);


    }
}
