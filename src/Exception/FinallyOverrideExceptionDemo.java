package Exception;

public class FinallyOverrideExceptionDemo {
    static void f() throws Exception {
        try {
            throw new Exception("A");
        } catch (Exception e) {
            throw new Exception("B");
        } finally {
            throw new Exception("C");
        }
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
