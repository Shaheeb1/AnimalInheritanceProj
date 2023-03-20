package com.softwareinstitute.sabir.shaheeb.animals;

public abstract class Animal {
    private String colour;
    protected String lastAte;
    private int age;
    private String name;

    public Animal() {
        super();
    }

    public void eat(String food) {

    }

    public String reproduce (Animal parent) {
        return "The animal is having a baby";
    }
    public void sleep (int sleeping) throws Exception {
        this.wait(sleeping);
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

    public void setAge (int lastAte) {
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

    @Override public String toString() {
        return "Animal - " + this.getClass() + "Colour " + colour +
                "age: " + age + "Ate last: " + lastAte
                + "name: "  + name;
    }


}