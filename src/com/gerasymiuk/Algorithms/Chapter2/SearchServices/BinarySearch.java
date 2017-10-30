package com.gerasymiuk.Algorithms.Chapter2.SearchServices;

import java.lang.reflect.Array;
import java.util.TreeSet;

/**
 * Created by gerasymiuk on 30.10.17.
 */
public class BinarySearch <T extends Comparable>{
    T[] arrayFromSet;
    public BinarySearch(TreeSet<T> set){

        //arrayFromSet = new T[set.size()]();
        @SuppressWarnings("unchecked")
        final T[] a = (T[]) Array.newInstance(set.last().getClass(), set.size());
        this.arrayFromSet = a;
        arrayFromSet = set.toArray(arrayFromSet);
    }
    public int getIndex(T value){
        int index=0;
        int compareResult=0;
        int lower=0,upper=arrayFromSet.length;
        while(upper-lower!=1){
            index = (upper+lower)/2;
            compareResult = arrayFromSet[index].compareTo(value);
            if(compareResult>0){
                upper=index;
            }else if(compareResult<0){
                lower=index;
            }else{
                return index;
            }
        }
        return -1;
    }
}
