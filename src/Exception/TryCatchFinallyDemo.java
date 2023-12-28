package Exception;

public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try {
            int temp = 10 / 0;
            System.out.println("result: " + temp);
            System.out.println("-------------------");
        } catch (ArithmeticException e) {
            System.out.println("exception occurs: " + e);
        } finally {
            System.out.println("finally always execute");
        }
    }
}
