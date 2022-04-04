import java.io.FileNotFoundException;

public class Human {
    private String name;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameException {
        if (name.matches("[A-Z][a-z]+"))
            this.name = name;
        else
            throw new NameException();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws FileNotFoundException, YearException, NullPointerException {
        if (year < 1000)
            throw new FileNotFoundException();
        if (year >= 1905 && year <= 2022)
            this.year = year;
        else
            throw new YearException(year);
    }
}
