import java.util.List;

public class Entry {
    private Integer key;
    private String value;

    public Entry(Integer key, String value) {
        this.key = key;
        this.value = value;
    }
}

class MyMap{
    private List<Entry> human;

    public void put(Integer key, String value){
        human.add(new Entry(key,value));
    }
}
