package com.softwareinstitute.sabir.shaheeb.animals;

public class Bat extends Mammal {
    public void eat (String food) {
        this.lastAte = food;
    }

    public void isSleep (boolean sleeping) {
        this.isSleep = sleeping;
    }
}
