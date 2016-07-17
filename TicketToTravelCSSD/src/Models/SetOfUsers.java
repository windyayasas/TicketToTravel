package Models;

/**
 *
 * @author Chathuri Lakmini
 */

import java.io.ObjectStreamException;
import java.util.Vector;

public class SetOfUsers extends Vector<User> {

    public SetOfUsers() {

        super();
    }

    public void addUser(User aUser) {
        super.add(aUser);
    }

    public void removeUser(User aUser) {
        super.remove(aUser);

    }

    public SetOfUsers getUserFromName(String name) {

        int size;

        size = this.size();

        User auser;

        SetOfUsers user_set = new SetOfUsers();

        for (int key = 0; key < size; key++) {
            auser = this.get(key);

            if (auser.getUserName().equals(name)) {
                user_set.add(auser);
            }

        }
        return user_set;

    }

    public SetOfUsers getUserFromNumber(int userId) {

        int size;

        size = this.size();

        User auser;

        SetOfUsers user_set = new SetOfUsers();

        for (int key = 0; key < size; key++) {
            auser = this.get(key);

            if (auser.getUserId() == userId) {
                user_set.add(auser);
            }

        }
        return user_set;

    }

    private static SetOfUsers INSTANCE;

    public static SetOfUsers getInstance() {

        if (INSTANCE == null) {

            synchronized (SetOfUsers.class) {

                if (INSTANCE == null) {
                    INSTANCE = new SetOfUsers();
                }
            }
        }

        return INSTANCE;
    }

    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
}
