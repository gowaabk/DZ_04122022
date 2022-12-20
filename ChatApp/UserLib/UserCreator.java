package ChatApp.UserLib;

public class UserCreator {

    public User createUser(String name) {
        return new User(name);
    }
}