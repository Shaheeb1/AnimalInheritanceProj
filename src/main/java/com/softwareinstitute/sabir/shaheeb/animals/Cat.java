package com.softwareinstitute.sabir.shaheeb.animals;
import com.softwareinstitute.sabir.shaheeb.exceptions.ThrowUpExceptions;

public class Cat extends Mammal {
    public void eat (String food) throws ThrowUpExceptions  {
        this.lastAte = food;

    }
}
