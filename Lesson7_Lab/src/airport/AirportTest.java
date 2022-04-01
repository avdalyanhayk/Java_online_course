package airport;

import airport.model.Plane;
import airport.service.AirportService;

public class AirportTest {
    public static void main(String[] args) {
        AirportService service = new AirportService();

        Plane plane = service.createPlane();
        Plane plane2 = service.createPlane();
        Plane plane3 = service.createPlane();
        Plane[] planes = {plane, plane3, plane2};

        System.out.println("--------------------------------");
        service.printNameAndReleaseDate(plane);
        System.out.println("--------------------------------");
        service.printNameOrHours(plane);
        System.out.println("--------------------------------");
        System.out.println(service.nameOfPlaneWithBiggerTime(plane, plane2));
        System.out.println("--------------------------------");
        service.planeWithBiggerName(plane, plane2).printInfo();
        System.out.println("--------------------------------");
        service.printPlaneArray(planes);
        System.out.println("--------------------------------");
        service.printMilitaryPlanesAfter2010(planes);
        System.out.println("--------------------------------");
        service.maxHoursInAir(planes).printInfo();
        System.out.println("--------------------------------");
        service.printOldestPlane(planes);
        System.out.println("--------------------------------");
        service.printNewestMilitary(planes);
        System.out.println("--------------------------------");
        service.sortByReleaseYear(planes);

    }
}
