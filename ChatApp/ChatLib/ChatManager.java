package ChatApp.ChatLib;

import ChatApp.UserLib.User;

public class ChatManager {

    public void enterInChat(Chatroom chatroom, User user) {
        chatroom.addUser(user);
    }

    public void exitFromChat(Chatroom chatroom, User user) {
        chatroom.removeUser(user);
    }

    public void getMessage(Chatroom chatroom, User user, String msg) {
        chatroom.printMessage(user, msg);
    }
}