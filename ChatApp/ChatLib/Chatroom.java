package ChatApp.ChatLib;

import ChatApp.UserLib.User;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

public class Chatroom implements BaseChat {
    String title;
    Date timeMsg = new Date();
    SimpleDateFormat ChatDateFormat = new SimpleDateFormat("yyyy.MM.dd : hh:mm:ss");
    ArrayList<String> msgList = new ArrayList<>();
    HashSet<User> users = new HashSet<>();

    public Chatroom(String title) {
        this.title = title;
    }

    public Chatroom() {
        this("");
    }
    @Override
    public void addUser(User user) {
        users.add(user);
        msgList.add(ChatDateFormat.format(timeMsg) + " Пользователь -- " + user.getName() + " Присоединился к чату");
        System.out.println(" Пользователь -- " + user + " Присоединился к чату");
    }

    @Override
    public void removeUser(User user) {
        users.remove(user);
        msgList.add(ChatDateFormat.format(timeMsg) + " Пользователь -- " + user.getName() + " Вышел из чата");
        System.out.println(" Пользователь -- " + user + " Вышел из чата");
    }

    @Override
    public void printMessage(User user, String msg) {
        msgList.add(ChatDateFormat.format(timeMsg) + " -- " + user.getName() + ": " + msg);
        System.out.println(user.getName() + ": " + msg);
    }

    @Override
    public void printUsers() {
        int i = 0;
        System.out.println("Пользователи чата:");
        for (User user : users) {
            System.out.println(++i + ". " + user.toString());
        }

    }

    @Override
    public void getHistory() {
        System.out.println("История чата " + this.title);
        for (String msg : msgList) {
            System.out.println(msg);
        }
    }
}