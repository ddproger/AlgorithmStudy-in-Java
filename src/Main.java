import com.gerasymiuk.Algorithms.Chapter2.SearchServices.BinarySearch;
import com.gerasymiuk.Algorithms.Chapter2.SearchServices.LinearSearch;

import java.util.TreeSet;

/**
 * Created by gerasymiuk on 30.10.17.
 */
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < 50; i+=2) {
            treeSet.add(new Integer(i));
        }
        System.out.println("Collection: ");
        System.out.println(treeSet.toString());
        System.out.println(new LinearSearch<>(treeSet).getIndex(51));
        System.out.println(new BinarySearch<>(treeSet).getIndex(0));

    }
}
