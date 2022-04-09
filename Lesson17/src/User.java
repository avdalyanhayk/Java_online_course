import java.io.Serializable;

/**
 * My User class
 */
public class User implements Cloneable, Serializable {
    private static final long serialVersionUID = 6529685198267757690L;
    public String login;
    public transient String password;
    public String email;

    public User(String login, String email, String password) {
        this.login = login;
        this.email = email;
        this.password = password;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * convert user to string value
     * @return string
     */
    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
