package hometask5.allAnimals;

import hometask5.WildAnimal;

public class Giraffe extends WildAnimal {

    public Giraffe(boolean isPredator, int id, int age, int weight, String color) {
        super(isPredator, id, age, weight, color);
    }

    @Override
    public String voice() {
        return super.voice() + "AaaaaAAAAaaaAAAaa...";
    }
}
