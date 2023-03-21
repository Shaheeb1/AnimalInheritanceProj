package com.softwareinstitute.sabir.shaheeb.animals;

public abstract class Mammal extends Animal {
    public String giveBirth (Animal parent) {
        return "I have gave birth to" + parent.getClass();
    }



}
