package hometask6.animals;

import hometask6.GetInfo;
import hometask6.Voice;
import hometask6.WildAnimal;

public class Crocodile extends WildAnimal implements GetInfo, Voice {

    public Crocodile(boolean isPredator, int id, int age, double weight, String color) {
        super(isPredator, id, age, weight, color);
    }

    @Override
    public String voice(){
        System.out.println("Crocodile");
        return super.voice() + " Grrrrrr...";
    }


    @Override
    public void info() {
        System.out.println("ID : " + getId());
        System.out.println("Age : " + getAge());
        System.out.println("Weight : " + getWeight() + " kg");
        System.out.println("Color : " + getColor());
        System.out.println("Predator : " + isPredator());
    }
}
