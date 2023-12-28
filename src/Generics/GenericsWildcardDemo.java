package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcardDemo {
    public static void main(String[] args) {
        // List<Integer> l1 = new ArrayList<>();
        // List<Number> l2 = l1;

        List<? extends Integer> l1 = new ArrayList<>();
        List<? extends Number> l2 = l1;
    }
}
