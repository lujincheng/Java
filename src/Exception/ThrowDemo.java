package Exception;

public class ThrowDemo {
    public static void main(String[] args) {
        f();
    }

    public static void f() {
        try {
            throw new RuntimeException("throw a exception");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
