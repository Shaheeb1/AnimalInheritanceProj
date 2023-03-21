package com.softwareinstitute.sabir.shaheeb.animals;

public class Eagle extends Bird {
    public void eat(String food) {
        this.lastAte = food;
    }

    public String dead (String dead) {
        return "The eagle has passed";
    }

}
