package com.gerasymiuk.Algorithms.Chapter3.SortingServices;

import java.util.List;

/**
 * Created by gerasymiuk on 03.11.17.
 */
public class InsertionSort<T extends Comparable> implements Sorting<T> {
    int marker;
    public InsertionSort(){
        this(0);
    }
    public InsertionSort(int marker){
        this.marker = marker;
    }
    @Override
    public void sort(List<T> list) {
        Comparable[] array = new Comparable[list.size()];
        array = list.toArray(array);
        int n = array.length;
        int j;
        Comparable tmp;
        for (int i = marker; i < n; i++) {
            tmp = array[i];
            for (j = i; j >0 && array[j-1].compareTo(tmp)>0; j--) {
                //System.out.println(array[j - 1].compareTo(tmp));
                array[j]=array[j-1];
            }
            array[j]=tmp;
        }
        listFromArray(list,(T[])array);
    }
}
