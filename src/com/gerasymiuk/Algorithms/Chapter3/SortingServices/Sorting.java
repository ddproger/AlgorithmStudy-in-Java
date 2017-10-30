package com.gerasymiuk.Algorithms.Chapter3.SortingServices;

import java.util.Collection;
import java.util.List;

/**
 * Created by gerasymiuk on 30.10.17.
 */
public interface Sorting<T extends Comparable> {
    void sort(List<T> list);
}
