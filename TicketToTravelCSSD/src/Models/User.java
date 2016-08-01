package Models;


import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 *
 * @author Chathuri Lakmini
 */
public class User implements Serializable {

    private int userId;

    private String userName;

    private String email;

    private String password;

    private String address;

    private String secretQuestion;

    private String answer;

    private String location;

    private String role;

    private static int userCount = 0;

    public User() {
        this.userId = 0;
        this.userName = null;
        this.email = null;
        this.password = null;
        this.address = null;
        this.secretQuestion = null;
        this.answer = null;
        this.location = null;
        this.role = null;
    }

    public User(String userName, String email, String password, String address, String secretQuestion, String answer, String location, String role) {

        
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.secretQuestion = secretQuestion;
        this.answer = answer;
        this.location = location;
        this.role = role;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSecretQuestion(String secretQuestion) {
        this.secretQuestion = secretQuestion;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getSecretQuestion() {
        return secretQuestion;
    }

    public String getAnswer() {
        return answer;
    }

    public String getLocation() {
        return location;
    }

    public String getRole() {
        return role;
    }

    private static User INSTANCE;

    public static User getInstance() {

        if (INSTANCE == null) {

            synchronized (User.class) {

                if (INSTANCE == null) {
                    INSTANCE = new User();
                }
            }
        }

        return INSTANCE;
    }

    private User readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
}
