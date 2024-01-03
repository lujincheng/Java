package Annotation;

public class RegexValidDemo {
    static class User {
        private String name;
        
        @RegexValid(policy = RegexValid.Policy.DATE)
        private String date;

        @RegexValid(policy = RegexValid.Policy.MAIL)
        private String mail;

        @RegexValid("^((\\+)?86\\s*)?((13[0-9])|(15([0-3]|[5-9]))|(18[0,2,5-9]))\\d{8}$")
        private String phone;

        public User(String name, String date, String mail, String phone) {
            this.name = name;
            this.date = date;
            this.mail = mail;
            this.phone = phone;
        }

        public String toString() {
            return String.format("User{name='%s', date='%s', mail='%s', phone='%s'}", name, date, mail, phone);
        }
    }

    static void printDate(@RegexValid(policy = RegexValid.Policy.DATE) String date) {
        System.out.println(date);
    }

    public static void main(String[] args) throws Exception {
        User user = new User("Tom", "1990-01-01", "xxx@163.com", "15996250399");
        User user2 = new User("Jack", "2019-02-28", "sadhgs@qq.com", "15996240987");
        if (RegexValidUtil.check(user)) {
            System.out.println(user + "正则校验通过");
        }
        if (RegexValidUtil.check(user2)) {
            System.out.println(user2 + "正则校验通过");
        }
    }
}
