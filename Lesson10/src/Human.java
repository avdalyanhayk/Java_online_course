public class Human {
    private String name;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        if (isCorrectName(name))
            this.name = name;
        else
            System.out.println("Invalid name");
    }

    private boolean isCorrectName(String n) {
        return n.matches("[A-Z][a-z]+");
    }

}
