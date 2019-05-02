package com.pro.game.entity;

import java.util.ArrayList;

public class Player{
    private String name;
    private ArrayList<String> bag=new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBag(ArrayList<String> bag) {
        this.bag = bag;
    }

    public ArrayList<String> getBag() {
        return bag;
    }
}