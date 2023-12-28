package Exception;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ThrowsDemo {
    public static void f1() throws NoSuchMethodException, NoSuchFieldException {
        Field field = Integer.class.getDeclaredField("digits");
        if (field != null) {
            System.out.println("get digits field success");
        }

        Method method = String.class.getMethod("toString", int.class);
        if (method != null) {
            System.out.println("get toString method success");
        }
    }

    public static void f2() {
        try {
            f1();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        f2();
    }
}
