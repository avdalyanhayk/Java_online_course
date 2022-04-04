public class YearException extends Exception {
    public YearException(int year){
        super("Year should be in 1905 - 2022 range: you entered " + year);
    }
}
