package Generics;

public class GenericsInterfaceDemo02<T> implements Content<T> {
    private T text;

    public GenericsInterfaceDemo02(T text) {
        this.text = text;
    }

    @Override
    public T text() {
        return text;
    }

    public static void main(String[] args) {
        GenericsInterfaceDemo02<String> g = new GenericsInterfaceDemo02<String>("hello");
        System.out.println(g.text());
    }
}
