package com.example.psur;

public class Contributor {
    private String login;
    private int contributors;

    @Override
    public String toString(){
        return login + " (" + contributors + ")";
    }

}
