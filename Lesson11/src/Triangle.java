public class Triangle {
    private MyPoint p1, p2, p3;
    private String name;


    public Triangle(String name, int x1, int y1, int x2, int y2, int x3, int y3) {
        this.name = name;
        p1 = new MyPoint(x1, y1);
        p2 = new MyPoint(x2, y2);
        p3 = new MyPoint(x3, y3);
    }


    static class MyPoint {
        public int x, y;

        public MyPoint(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }


    public void printPerimeter() {
        double side12 = Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
        double side13 = Math.sqrt(Math.pow(p1.x - p3.x, 2) + Math.pow(p1.y - p3.y, 2));
        double side23 = Math.sqrt(Math.pow(p2.x - p3.x, 2) + Math.pow(p2.y - p3.y, 2));
        System.out.println(side12 + side13 + side23);
    }
}
