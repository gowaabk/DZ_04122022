package ChatApp.ChatLib;

public class ChatCreator {

    public Chatroom createChat(String chatName) {
        return new Chatroom(chatName);
    }
}