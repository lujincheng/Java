package Enum;

import java.util.EnumSet;

public class EnumSetDemo {
    public static void main(String[] args) {
        EnumSet<ErrorCodeEn> errSet = EnumSet.allOf(ErrorCodeEn.class);
        for (ErrorCodeEn e : errSet) {
            System.out.println(e.name() + " : " + e.ordinal());
        }
    }
}
