public class Test {
    public static void main(String[] args) {
        User u1 = new User("log", "email", "pass");
        try {
            User u2 = (User) u1.clone();
            System.out.println(u2.login);
            System.out.println(u2.password);
            u2.login = "hayk";
            System.out.println(u1.login);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
