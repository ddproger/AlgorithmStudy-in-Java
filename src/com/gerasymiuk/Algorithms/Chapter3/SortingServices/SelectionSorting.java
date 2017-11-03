package com.gerasymiuk.Algorithms.Chapter3.SortingServices;

import java.util.List;

/**
 * Created by gerasymiuk on 04.11.17.
 */
public class SelectionSorting<T extends Comparable> implements Sorting<T> {
    boolean revers;
    public SelectionSorting(boolean revers){
        this.revers = revers;
    }
    public SelectionSorting(){
        this(false);
    }
    @Override
    public void sort(List<T> list) {
        Comparable[] array = new Comparable[list.size()];
        array = list.toArray(array);
        int n = array.length;
        int searchItemIndex ;
        for (int i = 0; i < n; i++) {
            searchItemIndex = i;
            for (int j = i+1; j < n; j++) {
                if((array[j].compareTo(array[searchItemIndex])<0)!=revers){
                    searchItemIndex = j;
                }
            }
            swap(array,i,searchItemIndex);
        }
        listFromArray(list,(T[])array);
    }
}
