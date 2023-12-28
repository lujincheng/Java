package Exception;

public class RuntimeExceptionDemo {
    public static void main(String[] args) {
        try {
            int res = 10 / 0;
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("==================");
    }
}
