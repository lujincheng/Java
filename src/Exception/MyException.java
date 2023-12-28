package Exception;

public class MyException {
    public static void main(String[] args) {
        throw new MyException1("自定义异常");
    }

    static class MyException1 extends RuntimeException {
        public MyException1(String message) {
            super(message);
        }
    }
}
