public class Teacher extends Human {// teacher IS A Human
    private int salary; // teacher HAS A salary

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void printInfo() {
        System.out.println("Salary " + salary);
        super.printInfo();
    }
}
