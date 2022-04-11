public interface Musician {
    void playMusic();

    default void readNotes() {
        System.out.println("Reading notes");
    }

    static void whoAmI() {
        System.out.println("I am a musician");
    }
}
