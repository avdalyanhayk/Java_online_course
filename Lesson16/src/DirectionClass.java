public class DirectionClass {
    public static DirectionClass NORTH = new DirectionClass("N");
    public static DirectionClass SOUTH = new DirectionClass("S");
    public static DirectionClass WEST = new DirectionClass("W");
    public static DirectionClass EAST = new DirectionClass("E");

    public final String value;

    private DirectionClass(String v){
        value = v;
    }
}
