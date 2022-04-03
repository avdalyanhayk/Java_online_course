public class Pianist implements Musician {
    @Override
    public void playMusic() {
        System.out.println("Playing piano");
    }

    @Override
    public void readNotes(String notes) {
        System.out.println("reading piano notes");
    }
}
