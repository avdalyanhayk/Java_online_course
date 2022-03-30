public class Test {
    public static void main(String[] args) {
        byte x = 4;
        int a = -129;
        x = (byte) a;
        System.out.println(x);

        x = 4;
        x = (byte) (x + 1);
        System.out.println(x);

        x++;
        System.out.println(x);

        x += 5;

        x = 1;
        System.out.println(x + 5 + " Java");
        System.out.println("barev " + x + 5 + " Java");
        System.out.println("barev " + (x + 5) + " Java");

        String s = "4.8";
        double z = Double.parseDouble(s);
        System.out.println(z + 1);


        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println(s2.getName());
        System.out.println(s3.getName());


        Student s4 = new Student("Hayk");
        System.out.println(s4.getName());


        Student s1 = new Student();
        s1.setAge(45);
        s1.setName("Hayk");

        Student s5 = new Student("Hayk", 45);

        System.out.println(s5.getName() + " " + s5.getAge());


        Car c = new Car("44aa444");
        Car c2 = new Car();


        s1.sum(4, 5);
        s1.sum(1, 8, 9);
        s1.f();
        s1.f(4);
        s1.f(4L);
        s1.f(4, "a");

        System.out.println("-------------------");
        Teacher t1 = new Teacher();
        t1.setName("Hayk");
        t1.setYear(2000);
        t1.setSalary(1000);
        t1.setPhone("554654654");
        t1.printInfo();

        System.out.println("-------------------");
        Administrator a1 = new Administrator();
        a1.setName("Anna");
        a1.setDepartment("Music");
        a1.setYear(1999);
        a1.setPhone("4456454654");

        a1.printInfo();


    }
}
