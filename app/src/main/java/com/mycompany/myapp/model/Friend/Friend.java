package com.mycompany.myapp.model.Friend;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by julioa on 10/04/14.
 */
public class Friend {
    private String name;
    private String alias;
    private List<Mensaje> mensajes = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void addMensaje(Mensaje msg) {
        mensajes.add(msg);
    }

    public int MensajesCount() {
        return mensajes.size();
    }

    public Mensaje getMensaje(int order) {
        return mensajes.get(order);
    }
}
