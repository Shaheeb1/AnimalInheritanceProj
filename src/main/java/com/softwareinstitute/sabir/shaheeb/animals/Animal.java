package com.softwareinstitute.sabir.shaheeb.animals;

import com.softwareinstitute.sabir.shaheeb.exceptions.ThrowUpExceptions;

public abstract class Animal {
    protected String colour;
    protected String lastAte;
    protected int age;
    protected String name;
    protected boolean isAlive;
    protected boolean isSleep;

    protected Cat a;

    public Animal() {
        super();
    }

    public void eat(String food) throws ThrowUpExceptions {

    }

    public String reproduce (Animal parent) {

        return "The animal is having a baby";
    }
    public void sleep (int sleeping){

    }

    public String pooping () {
        return "The animal is pooping";
    }

    public void setLastAte (String lastAte) {
        this.lastAte = lastAte;
    }

    public String getLastAte () {
        return lastAte;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public int getAge () {
        return age;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean getAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public boolean getAsleep() {
        return isSleep;
    }

    public void setAsleep(boolean sleep) {
        this.isSleep = sleep;
    }

    public Animal getCat () {
        return a;
    }

    public void setCat(Animal cat) {
        cat = a;
    }

    @Override public String toString() {
        return "Animal - " + this.getClass() + "Colour: " + colour +
                "age: " + age + "Ate last: " + lastAte
                + "name: "  + name;
    }


}
