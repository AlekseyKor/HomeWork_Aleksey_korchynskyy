package hometask5.allAnimals;

import hometask5.DomesticAnimal;

public class Dog extends DomesticAnimal {


    public Dog(String name, boolean isVaccinated, int id, int age, int weight, String color) {
        super(name, isVaccinated, id, age, weight, color);
    }

    @Override
    public String voice() {
        return super.voice() + " Woof";
    }
}
