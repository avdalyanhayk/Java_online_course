package airport.service;

import airport.model.Plane;

import java.util.Scanner;

public class AirportService {

    public Plane createPlane() {
        Scanner s = new Scanner(System.in);
        Plane plane = new Plane();
        System.out.println("Enter name of the plane");
        plane.setName(s.next());
        System.out.println("Enter hours in air");
        plane.setHoursInAir(s.nextInt());
        System.out.println("Enter release year");
        plane.setReleaseYear(s.nextInt());
        System.out.println("Is Military plane? Y/N");
        String m = s.next().toLowerCase();
        plane.setMilitary(m.charAt(0) == 'y');
        return plane;
    }

    public void printNameAndReleaseDate(Plane plane) {
        System.out.println(plane.getName() + ", " + plane.getReleaseYear());
    }

    public void printNameOrHours(Plane plane) {
//        if (plane.getReleaseYear()>2000)
//            System.out.println(plane.getName());
//        else
//            System.out.println(plane.getHoursInAir());

        System.out.println(plane.getReleaseYear() > 2000 ? plane.getName() : plane.getHoursInAir());
    }

    public String nameOfPlaneWithBiggerTime(Plane plane1, Plane plane2) {
//        if (plane1.getHoursInAir() > plane2.getHoursInAir())
//            return plane1.getName();
//        else
//            return plane2.getName();
        return plane1.getHoursInAir() > plane2.getHoursInAir() ? plane1.getName() : plane2.getName();
    }

    public Plane planeWithBiggerName(Plane a, Plane b) {
//        if (a.getName().length() > b.getName().length())
//            return a;
//        return b;
        return a.getName().length() > b.getName().length() ? a : b;
    }

    public void printPlaneArray(Plane[] planes) {
        for (Plane x : planes) {
            x.printInfo();
        }
    }

    public void printMilitaryPlanesAfter2010(Plane[] planes) {
        for (Plane x : planes) {
            if (x.isMilitary() && x.getReleaseYear() > 2010)
                x.printInfo();
        }
    }

    public Plane maxHoursInAir(Plane[] planes) {
        Plane max = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getHoursInAir() > max.getHoursInAir()) {
                max = planes[i];
            }
        }
        return max;
    }

    public void printOldestPlane(Plane[] planes) {
        Plane min = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getReleaseYear() < min.getReleaseYear()) {
                min = planes[i];
            }
        }
        min.printInfo();
    }

    public void printNewestMilitary(Plane[] planes) {
        Plane max = planes[0];//{n 2021, m 2020, m 2019}
        int indexOfMilitary = 0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary()) {
                max = planes[i];
                indexOfMilitary = i;
                break;
            }
        }
        for (int i = indexOfMilitary + 1; i < planes.length; i++) {
            if (planes[i].isMilitary() && planes[i].getReleaseYear() > max.getReleaseYear()) {
                max = planes[i];
            }
        }
        max.printInfo();
    }

    public void sortByReleaseYear(Plane[] planes) {
        boolean qaniDerIfMtnume = true;

        int countOfFors = 0;
        while (qaniDerIfMtnume) {
            qaniDerIfMtnume = false;
            for (int i = 0; i < planes.length - 1 - countOfFors; i++) {
                if (planes[i].getReleaseYear() > planes[i + 1].getReleaseYear()) {
                    Plane zz = planes[i];
                    planes[i] = planes[i + 1];
                    planes[i + 1] = zz;
                    qaniDerIfMtnume = true;
                }
            }
            countOfFors++;
        }

        printPlaneArray(planes);
    }

}
