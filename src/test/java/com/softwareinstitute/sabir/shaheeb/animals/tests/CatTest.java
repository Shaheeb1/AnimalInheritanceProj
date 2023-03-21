package com.softwareinstitute.sabir.shaheeb.animals.tests;

import com.softwareinstitute.sabir.shaheeb.animals.*;
import com.softwareinstitute.sabir.shaheeb.exceptions.ThrowUpExceptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {

    @Test
    void testing_cat_age() {
        Cat testCat = new Cat();
        testCat.setAge(17);

        assertEquals(17, testCat.getAge(),"expected age should be 20");

    }

    @Test
    void testing_cat_name() {
        Cat testCat = new Cat();
        testCat.setName("Whiskers");

        assertEquals("Whiskers", testCat.getName(),"expected name should be Whiskers");

    }

    @Test
    void testing_cat_colour() {
        Cat testCat = new Cat();
        testCat.setColour("Black");
        assertEquals("Black", testCat.getColour(),"expected colour should be black");

    }

   // @Test
   // void testing_cat_last_ate() {
     //   Cat testCat = new Cat();
      //  testCat.setLastAte("milk");
     //   assertEquals("milk", testCat.getLastAte(),"expected last ate should be milk");

  //  }

    @Test
    void testing_eat() throws ThrowUpExceptions {
        Cat testCat = new Cat();
        testCat.eat("food");
        assertEquals("food", testCat.getLastAte(), "expected last ate should be milk");
    }
    //@Test
   // void testing_reproduce() {
  //   Cat catBirth = new Cat();
    // catBirth.giveBirth("Thomas", "Black");
    // assertEquals("Thomas", catBirth.getName(), "Black", catBirth.getColour(), "Expected name is thomas");
    // assertEquals("Black", catBirth.getColour(), "Expected name is thomas");
   // }

   @Test
   void testing_is_alive() {
       Eagle alive = new Eagle();
       alive.alive(false);
       assertEquals(false, alive.getAlive(), "expected outcome for eagle alive should be false");
   }

    @Test
    void testing_is_asleep() {
        Bat asleep = new Bat();
        asleep.isSleep(true);
        assertEquals(true, asleep.getAsleep(), "expected outcome for bat sleeping should be true");
    }

   // @Test
   // void testing_is_reproducing() {

      //  Cat parent = this.
      //  Cat reproducing = new Cat();
      //  reproducing.giveBirth(Cat parent, )
      //  assertEquals(reproducing, "Black", "expected outcome for bat sleeping should be true");
   // }

}
