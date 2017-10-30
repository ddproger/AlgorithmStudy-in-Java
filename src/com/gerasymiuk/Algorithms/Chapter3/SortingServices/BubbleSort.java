package com.gerasymiuk.Algorithms.Chapter3.SortingServices;

import java.util.List;

/**
 * Created by gerasymiuk on 30.10.17.
 */
public class BubbleSort<T extends Comparable> implements Sorting<T>{
    @Override
    public List<T> sort(List<T> list) {
        Comparable[] array = new Comparable[list.size()];
        array = list.toArray(array);
        int size = array.length,compareResult=0;
        for (int i = size-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                compareResult = array[j].compareTo(array[j+1]);
                if(compareResult>0)shufle(array,j,j+1);
            }
        }
        List<T> result;
        try {
            result = (List<T>) list.getClass().newInstance();
            for (int i = 0; i < size; i++) {
                result.add((T)array[i]);
            }
            return result;
        } catch (InstantiationException|IllegalAccessException e) {
            return null;
        }
    }
    private void shufle(Comparable[] array, int i, int i1) {
        Comparable temp;
        temp = array[i1];
        array[i1]=array[i];
        array[i]=temp;
    }
}
