package com.gerasymiuk.Algorithms.Chapter2.SearchServices;

import java.util.TreeSet;

/**
 * Created by gerasymiuk on 30.10.17.
 */
public class BinarySearch <T extends Comparable>{
    T[] arrayFromSet;
    public BinarySearch(TreeSet<T> set){
        arrayFromSet = (T[]) set.toArray();
    }
    public int getIndex(T value){
        int index=0;
        int compareResult=0;
        int lower=0,upper=arrayFromSet.length;
        while(upper>lower){
            index = (upper-lower)/2;
            compareResult = arrayFromSet[index].compareTo(value);
            if(compareResult<0){
                upper=index;
            }else if(compareResult>0){
                lower=index;
            }else{
                return index;
            }
        }
        return -1;
    }
}
