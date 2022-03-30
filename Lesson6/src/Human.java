public class Human{
    private String name;
    private int year;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void printInfo(){
        System.out.println("Name " + name);
        System.out.println("Year " + year);
        System.out.println("Phone " + phone);
    }
}
