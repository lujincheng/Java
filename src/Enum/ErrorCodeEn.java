package Enum;

public enum ErrorCodeEn {
    OK(0) {
        @Override
        public String getDescription() {
            return "success";
        }
    },
    ERROR_A(100) {
        @Override
        public String getDescription() {
            return "ERROR_A";
        }
    },
    ERROR_B(200) {
        @Override
        public String getDescription() {
            return "ERROR_B";
        }
    };

    private int code;

    private ErrorCodeEn(int number) {
        this.code = number;
    }

    public int getCode() {
        return code;
    }

    public abstract String getDescription();

    public static void main(String[] args) {
        for (ErrorCodeEn e : ErrorCodeEn.values()) {
            System.out.println("code: " + e.getCode() + ", description: " + e.getDescription());
        }
    }
}
