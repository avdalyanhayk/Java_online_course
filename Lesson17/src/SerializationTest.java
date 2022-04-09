import java.io.*;

public class SerializationTest {
    public static void main(String[] args) {
        User user = new User("log13", "aa@aa.a", "pass15");
        serializeUser(user);// serialize em anum user objecty
        User u = deserialize();
        System.out.println(u.toString());
        System.out.println(sum(-1,-8));
    }

    private static User deserialize() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("user.ser");
            ois = new ObjectInputStream(fis);
            User o = (User) ois.readObject();
            return o;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    // try with resources
    private static void serializeUser(User user) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("user.ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(user);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * sum of to positive numbers
     *
     * @param x any positive number
     * @param y any positive number
     * @return value of x + y
     */
    static int sum(int x, int y) {
        if (x < 0 || y < 0)
            return 0;
        return x + y;
    }
}
