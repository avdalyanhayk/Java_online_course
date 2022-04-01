public class Test {
    public static void main(String[] args) {
        new Human();
        System.out.println(Human.count);
        System.out.println(Human.a);
        Student s1 = new Student("Hayk");
        s1.sum(4, 5);
        Student s2 = new Student("Anna");
        s2.sum(4, 5);

        Student.sum(4, 6);

        String s = "7";
        int a = Integer.parseInt(s);
        System.out.println(a + 1);
        char c = '2';
        String pass = "asd as454A6 adsf";
        int count = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isUpperCase(pass.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println(Integer.MAX_VALUE);
    }
}
