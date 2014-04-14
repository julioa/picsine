package com.mycompany.myapp.model.Friend;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by julioa on 10/04/14.
 */
public class ManagerAmigos {

    private List<Friend> amigos = new ArrayList();

    private ManagerAmigos() {}

    private static ManagerAmigos instance = null;

    public static ManagerAmigos getInstance() {
        if (instance == null) {
            instance = new ManagerAmigos();
        }

        return instance;
    }

    public void addFriend(Friend friend) {
        amigos.add(friend);
    }

    public int getCount() {
        return amigos.size();
    }

    public Friend getFriend(int order) {
        return amigos.get(order);
    }




}
