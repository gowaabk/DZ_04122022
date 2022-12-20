package ChatApp.ChatLib;

import ChatApp.UserLib.User;

public interface BaseChat {

    void addUser(User user);

    void removeUser(User user);
    
    void printUsers();

    void printMessage(User user, String msg);

    void getHistory();
}