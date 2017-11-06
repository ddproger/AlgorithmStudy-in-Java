package com.gerasymiuk.Algorithms.Chapter3.SortingServices;

import java.util.List;

/**
 * Created by gerasymiuk on 07.11.17.
 */
public class MergeSort <T extends Comparable> implements Sorting<T> {
    @Override
    public void sort(List<T> list) {
        Comparable[] array = new Comparable[list.size()];
        array = list.toArray(array);
        mergeSort(array,0,array.length-1);
        listFromArray(list,(T[])array);
    }
    private void mergeSort(Comparable[] array, int lowerIndex, int upperIndex){
        if(lowerIndex==upperIndex)return ;
        else {
            int mid = (upperIndex+lowerIndex)/2;
            mergeSort(array,lowerIndex,mid);
            mergeSort(array,mid+1,upperIndex);
            merge(array,lowerIndex,mid+1,upperIndex);
        }
    }
    private void merge(Comparable[] array, int lowerPtr,int hightPtr, int upperIndex){
        int lowerIndex = lowerPtr;
        int mid = hightPtr-1;
        int n = upperIndex-lowerPtr+1;

        Comparable[] tmp = new Comparable[n];
        int tmpIndex = 0;
        while (lowerPtr<=mid&&hightPtr<=upperIndex){
            int res = array[lowerPtr].compareTo(array[hightPtr]);
            Comparable num;
            if(res<0){
                num = array[lowerPtr++];
            }else {
                num = array[hightPtr++];
            }
            tmp[tmpIndex++]=num;
        }
        while (lowerPtr<=mid){
            tmp[tmpIndex++]=array[lowerPtr++];
        }
        while (hightPtr<=upperIndex){
            tmp[tmpIndex++]=array[hightPtr++];
        }
        tmpIndex=0;
        for (int i = lowerIndex; i <= upperIndex; i++) {
            array[i]=tmp[tmpIndex++];
        }
    }
}
