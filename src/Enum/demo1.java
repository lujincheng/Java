package Enum;

public class demo1 {
    enum Color {RED, GREEN, BLUE}
    enum Size {BIG, MIDDLE, SMALL}
    public static void main(String[] args) {
        System.out.println("print all color");
        for (Color c : Color.values()) {
            System.out.println(c + " ordinal: " + c.ordinal());
        }

        System.out.println("print all Size");
        for (Size s : Size.values()) {
            System.out.println(s + " ordinal: " + s.ordinal());
        }

        Color green = Color.GREEN;
        System.out.println("green.name(): " + green.name());
        System.out.println("green.getDeclaringClass(): " + green.getDeclaringClass());
        System.out.println("green.hashCode(): " + green.hashCode());
        System.out.println("green.compareTo(Color.GREEN): " + green.compareTo(Color.GREEN));
        System.out.println("green.equals(Color.GREEN): " + green.equals(Color.GREEN));
        System.out.println("green.equals(Size.MIDDLE): " + green.equals(Size.MIDDLE));
        System.out.println("green.equals(1): " + green.equals(1));
        System.out.format("green == Color.GREEN: %b \n ", green == Color.GREEN);
        
    }
}
