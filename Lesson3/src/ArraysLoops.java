public class ArraysLoops {
    public static void main(String[] args) {
        int[] a = new int[6];
        System.out.println(a[4]);
        a[0] = 4;
        a[1] = 74;
        a[3] = -7;
        a[4] = 1;
        a[5] = 1;

        System.out.println(a[0] + a[4]);
        System.out.println(a.length);
        System.out.println(a[0] + a[a.length - 1]);

        int[] array = {4, 1, -8, 0, 3, 4, 6};
        System.out.println(array[0]);
        System.out.println(array[array.length - 1]);


        int x = -4;

        if (x > 0) {
            System.out.println("Positive");
        } else
            System.out.println("Non Positive");

        int b;
//        if (x > 0)
//            b = 1;
//        else
//            b = 0;

        b = x > 0 ? 1 : 0;
        System.out.println(b);

        // x > 0 ? System.out.println("Positive") : System.out.println("Non Positive");
        System.out.println(x > 0 ? "Positive" : "Non Positive");
        System.out.println("----------------");

        x = 0;
        if (x > 0) {
            System.out.println("Positive");
        } else {
            if (x < 0)
                System.out.println("Negative");
            else
                System.out.println("Zero");
        }

        System.out.println(x > 0 ? "Positive" : x < 0 ? "Negative" : "Zero");

        x = 1;

        if (x == 1) {
            System.out.println("One");
        } else {
            if (x == 2) {
                System.out.println("Two");
            } else {
                if (x == 3) {
                    System.out.println("Three");
                } else
                    System.out.println("Bigger");
            }
        }

        x = 1;
        System.out.println("----------------------");

        switch (x) {
            case 2:
                System.out.println("Two");
                break;
            case 1:
                System.out.println("One");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
            case 5:
                System.out.println("java");
                break;
            default:
                System.out.println("Bigger");
        }


        String y = "aa";
        switch (y) {
            case "a":
                System.out.println("");
                break;
            case "b":
                System.out.println("");
                break;

        }


        System.out.println("-------------------------------");
        int counter = 1;

        while (counter < 11) {
            System.out.print(counter++ + " ");
        }

        System.out.println();
        x = 11;


        while (x <= 4) {
            System.out.println("barev");
            x++;
        }

        x = 11;
        System.out.println("---------------------");
        do {
            System.out.println("Barev");
            x++;
        } while (x <= 4);


        int c = 1;
        while (c <= 10) {
            System.out.print(c + " ");
            c++;
        }
        System.out.println();
        System.out.println(c);

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        for (int k = 0; k < 10; k++) {

        }
        for (int counter2 = 0; counter2 < 10; counter2++) {

        }


        System.out.println("------------------------");
        String[] names = {"Hayk", "Anna", "Ani", "Mariam", "Karen"};
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
//        System.out.println(names[3]);
//        System.out.println(names[4]);
// x<=5  x<6

        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }


        for (String s : names) {
            System.out.println(s);
        }

        for (int index = 0; index < names.length; index++) {
            String s = names[index];
            System.out.println(s);
        }

        System.out.println("-------------------");
//        System.out.println(names[names.length-1]);
//        System.out.println(names[names.length-2]);
//        System.out.println(names[names.length-3]);
//        System.out.println(names[names.length-4]);
//        //.....
//        System.out.println(names[0]);

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        for (int i = 0; i < 1000; i = i + 2) {
            System.out.println("Hayk");
        }

        System.out.println("--------------");

        int[] array2 = {4, -8, 4, 1, 3, -1};
        for (int element : array2) {
            if (element < 0) {
                System.out.println("Ayo");
                break;
            }
        }

        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                continue;
            System.out.println(i);
        }

    }
}

// a = [1,5,6,78,4]
// a