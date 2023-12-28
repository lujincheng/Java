package Enum;

import java.util.EnumMap;

public class EnumMapDemo {
    public enum Signal {
        GREEN, YELLOW, RED
    }

    public static void main(String[] args) {
        EnumMap<Signal, String> errMap = new EnumMap<>(Signal.class);
        errMap.put(Signal.RED, "红灯");
        errMap.put(Signal.GREEN, "绿灯");
        errMap.put(Signal.YELLOW, "黄灯");

        for (var entry : errMap.entrySet()) {
            System.out.println(entry.getKey().name() + " : " + entry.getValue());
        }
    }
}
