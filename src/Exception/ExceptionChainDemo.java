package Exception;

public class ExceptionChainDemo {
    static class MyException1 extends Exception {
        public MyException1(String message) {
            super(message);
        }
    }

    static class MyException2 extends Exception {
        public MyException2(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static void f1() throws MyException1 {
        throw new MyException1("exception1 occurs");
    }

    public static void f2() throws MyException2 {
        try {
            f1();
        } catch (MyException1 e) {
            throw new MyException2("exception2 occurs", e);
        }
    }

    public static void main(String[] args) throws MyException2 {
        f2();
    }
}
