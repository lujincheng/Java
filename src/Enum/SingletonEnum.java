package Enum;

public class SingletonEnum {
    public enum SingleEn {
        INSTANCE;

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        SingleEn.INSTANCE.setName("en");
        System.out.println(SingleEn.INSTANCE.getName());
    }
}
