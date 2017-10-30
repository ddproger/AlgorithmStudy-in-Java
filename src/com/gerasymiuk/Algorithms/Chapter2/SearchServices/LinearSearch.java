package com.gerasymiuk.Algorithms.Chapter2.SearchServices;

import java.util.TreeSet;

/**
 * Created by gerasymiuk on 30.10.17.
 */
public class LinearSearch<T> {
    Iterable<T> collection;
    public LinearSearch(Iterable<T> collection){
        this.collection = collection;
    }
    public int getIndex(T value){
        int index=0;
        for (T item: collection) {
            if(item.equals(value))return index;
            index++;
        }
        return -1;
    }
}
