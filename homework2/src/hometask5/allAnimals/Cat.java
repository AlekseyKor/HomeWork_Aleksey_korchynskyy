package hometask5.allAnimals;

import hometask5.DomesticAnimal;

public class Cat extends DomesticAnimal {

    public Cat(String name, boolean isVaccinated, int id, int age, int weight, String color) {
        super(name, isVaccinated, id, age, weight, color);
    }

    @Override
    public String voice() {
        return super.voice() + " Meow";
    }
}
