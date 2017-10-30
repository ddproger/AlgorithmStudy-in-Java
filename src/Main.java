import com.gerasymiuk.Algorithms.Chapter2.SearchServices.BinarySearch;
import com.gerasymiuk.Algorithms.Chapter2.SearchServices.LinearSearch;

import java.util.TreeSet;

/**
 * Created by gerasymiuk on 30.10.17.
 */
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        System.out.println("Collection: ");
        for (int i = 0; i < 100; i++) {
            treeSet.add(new Integer(i));
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(new BinarySearch<Integer>(treeSet).getIndex(8));
        System.out.println(new LinearSearch<>(treeSet).getIndex(8));

    }
}
