package Generics;

public class GenericsInterfaceDemo01 implements Content<Integer> {
    private int text;

    public GenericsInterfaceDemo01(int text) {
        this.text = text;
    }

    @Override
    public Integer text() {
        return text;
    }

    public static void main(String[] args) {
        GenericsInterfaceDemo01 g = new GenericsInterfaceDemo01(10);
        System.out.println(g.text());
    }
}
