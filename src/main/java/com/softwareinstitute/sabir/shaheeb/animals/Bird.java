package com.softwareinstitute.sabir.shaheeb.animals;

public abstract class Bird extends Animal {
    public String layEgg (Animal parent) {
       return "I layed an egg" + parent.getClass();
    }
}
