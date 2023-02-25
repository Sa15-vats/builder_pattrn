package org.example;
/**
 * Builder pattern : It is creational design pattern used to create complex presentation of objects.
 * Lets take an example we have class which has initially 4 fields, so you decided to go with constructor then few more fields added
 * in same class which are optional and class modification goes on. So one choice is to have different args constructor.
 * That is good but till some extent how we will remember which argument number for what if list is so big!!!
 *
 * One more option is to use setters method but that has chances of missing pieces of some mandatory fields which leads to inconsistent object.
 *
 * By builder patter we take responsibility of creating object and providing back to client. Client just provides input and until
 * they won't call build method we won't create object.
 *
 * Builder pattern is also used when single class has different object representation
 */
public class Main {
    public static void main(String[] args) {
        //Using builder we have created the object and we as implementer of builder pattern need to assure that this is not inconsistent object.
        Burger burger = new Burger.BurgerBuilder()
                .mayonese(true)
                .onion(false)
                .egg(false)
                .extraCheese(true)
                .size("LARGE")
                .build();

        Meal meal = new MealDirector(new VegMealBuilder()).prepareMeal();

    }
}