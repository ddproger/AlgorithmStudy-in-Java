package com.gerasymiuk.Algorithms.Chapter3.SortingServices;

import java.util.List;

/**
 * Created by gerasymiuk on 13.11.17.
 */
public class ShellSort <T extends Comparable> implements  Sorting<T> {
    @Override
    public void sort(List<T> list) {
        Comparable[] array = new Comparable[list.size()];
        Comparable temp;
        array = list.toArray(array);
        int n = array.length;
        int h=getHFromN(n);
        int inner,outer;
        while (h>0){
            for(outer=h; outer<n; outer++)
            {
                temp = array[outer];
                inner = outer;
                while(inner > h-1 &&  array[inner-h].compareTo(temp)>=0)
                {
                    array[inner] = array[inner-h];
                    inner -= h;
                }
                array[inner] = temp;
            }
            h = (h-1) / 3;
        }
        listFromArray(list,(T[])array);
    }

    private int getHFromN(int n){
        int h=1;
        while(h<n){
            h=3*h+1;
        }
        return (h-1)/3;
    }
}
