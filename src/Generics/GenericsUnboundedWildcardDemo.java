package Generics;

import java.util.Arrays;
import java.util.List;

public class GenericsUnboundedWildcardDemo {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3,4);
        List<String> l2 = Arrays.asList("a", "b", "c");

        printList(l1);
        printList(l2);
    }
}
