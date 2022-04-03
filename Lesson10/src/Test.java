public class Test {
    public static void main(String[] args) {
        Pianist p = new Pianist();
        p.playMusic();

        BassGuitarist b = new BassGuitarist();
        b.playMusic();
        b.bass();
        ClassicalGuitarist cg = new ClassicalGuitarist();
        cg.playMusic();

        Guitarist g = new BassGuitarist();
        g.playMusic();
        g = new ClassicalGuitarist();
        g.playMusic();

        f(new ClassicalGuitarist());
        f(new BassGuitarist());
        f(cg);

        System.out.println("--------------------------");
        play(new Guitarist[]{new BassGuitarist(), new ClassicalGuitarist(), new BassGuitarist()});
        h(new Human());
        h(new Student());

        p(new Pianist());
        p(new BassGuitarist());
        p(new ClassicalGuitarist());

        Student s = new Student();
        s.sum(1, 4);
        s.sum(1, 4, 9);
    }

    static void play(Guitarist[] guitarists) {
        for (Guitarist g : guitarists) {
            g.playMusic();
            if (g instanceof BassGuitarist) {
                ((BassGuitarist) g).bass();
            }
        }
    }

    static void f(Guitarist c) {
        c.playMusic();
    }

    static void h(Human h) {

    }

    static void p(Musician m) {
        m.playMusic();
    }

}
