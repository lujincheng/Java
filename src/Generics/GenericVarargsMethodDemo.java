package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericVarargsMethodDemo {
    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<>();
        Collections.addAll(result, args);
        return result;
    }

    public static void main(String[] args) {
        List<String> list = makeList("A");
        System.out.println(list.toString());
        list = makeList("A", "B", "C");
        System.out.println(list.toString());
    }
}
