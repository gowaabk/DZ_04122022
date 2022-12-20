package ChatApp;

import ChatApp.ChatLib.ChatCreator;
import ChatApp.ChatLib.ChatManager;
import ChatApp.ChatLib.Chatroom;
import ChatApp.UserLib.User;
import ChatApp.UserLib.UserCreator;

public class myChatApp {
    public static void main(String[] args) {
        ChatManager myChatManager = new ChatManager();
        ChatCreator myChatChreator = new ChatCreator();
        UserCreator myUserCreator = new UserCreator();

        Chatroom myChat = myChatChreator.createChat("*Название чата*");

        User user1 = myUserCreator.createUser("Маша");
        User user2 = myUserCreator.createUser("Паша");
        User user3 = myUserCreator.createUser("Даша");
        User user4 = myUserCreator.createUser("Коля");
        User user5 = myUserCreator.createUser("Иван");

        myChatManager.enterInChat(myChat, user1);
        myChatManager.enterInChat(myChat, user2);
        myChatManager.enterInChat(myChat, user3);
        myChatManager.enterInChat(myChat, user4);
        myChatManager.enterInChat(myChat, user5);
        System.out.println();


        myChat.printUsers();
        System.out.println();

        myChatManager.getMessage(myChat, user1, "Пока))");
        myChatManager.getMessage(myChat, user2, "Всем чмоки в этом чате");
        myChatManager.getMessage(myChat, user3, "Цой жив!!!");
        myChatManager.getMessage(myChat, user5, "8-P");

        myChatManager.exitFromChat(myChat, user4);
        myChatManager.exitFromChat(myChat, user5);

        System.out.println();
        myChat.printUsers();
        System.out.println();

        myChat.getHistory();
    }
}