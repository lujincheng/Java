package Enum;

interface INumberEnum {
    int getCode();
    String getDescription();
}

public enum ErrorCodeEn2 implements INumberEnum{
    OK(0, "SUCCESS"),
    ERROR_A(100, "ERROR_A"),
    ERROR_B(200, "ERROR_B");

    ErrorCodeEn2(int number, String description) {
        this.code = number;
        this.description = description;
    }

    private int code;
    private String description;

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
