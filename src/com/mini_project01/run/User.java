package com.mini_project01.run;

public class User {

    Wild wild = new Wild();

    public void setChar() {
        wild.setChar();
    }

    public void goSearch() {
        wild.search();
    }

    public void goRest() {
        wild.rest();
    }

    public void status() {
        wild.getStatus();
    }
}
