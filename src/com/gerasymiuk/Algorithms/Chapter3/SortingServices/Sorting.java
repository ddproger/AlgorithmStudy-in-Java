package com.gerasymiuk.Algorithms.Chapter3.SortingServices;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by gerasymiuk on 30.10.17.
 */
public interface Sorting<T extends Comparable> {
    void sort(List<T> list);
    default void swap(Comparable[] array, int i, int i1) {
        Comparable temp;
        temp = array[i1];
        array[i1]=array[i];
        array[i]=temp;
    }
    default void listFromArray(List<T> list, T[] array){
        list.clear();
        int size = array.length;
        for (int i = 0; i < size; i++) {
            list.add(array[i]);
        }
    }
}
