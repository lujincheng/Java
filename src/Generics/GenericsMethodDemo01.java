package Generics;

public class GenericsMethodDemo01 {
    public static <T> void printClass(T obj) {
        System.out.println(obj.getClass().toString());
    }

    public static void main(String[] args) {
        printClass(10);
        printClass("Hello");
    }
}
