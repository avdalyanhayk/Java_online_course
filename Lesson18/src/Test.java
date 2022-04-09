public class Test {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, -4};
        int[] b = {-4, -55, 6, -4};

        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);


        int min = b[0];
        for (int i = 1; i < b.length; i++) {
            if (min > b[i]) {
                min = b[i];
            }
        }
        System.out.println(min);

        String s = null;
        System.out.println(s.length());
    }
}
