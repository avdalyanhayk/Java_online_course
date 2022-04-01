package airport.model;

public class Plane {
    private String name;
    private int releaseYear;
    private int hoursInAir;
    private boolean isMilitary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getHoursInAir() {
        return hoursInAir;
    }

    public void setHoursInAir(int hoursInAir) {
        this.hoursInAir = hoursInAir;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public void printInfo() {
        System.out.printf("Name = %s, Release year = %d, Hours in Air = %d, Is Military = %s\n",
                name, releaseYear, hoursInAir, isMilitary ? "yes" : "no");
    }
}
