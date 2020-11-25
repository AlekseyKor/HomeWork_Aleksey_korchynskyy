package hometask6.animals;

import hometask6.DomesticAnimal;
import hometask6.GetInfo;
import hometask6.Voice;

public class Fish extends DomesticAnimal implements GetInfo, Voice {

    public Fish(String name, boolean isVaccinated, int id, int age, double weight, String color) {
        super(name, isVaccinated, id, age, weight, color);
    }

    @Override
    public String voice(){
        System.out.println("Fish. It's name is " + getName());
        return "...";
    }

    @Override
    public void info() {
        System.out.println("ID : " + getId());
        System.out.println("Age : " + getAge());
        System.out.println("Weight : " + getWeight() + " kg");
        System.out.println("Color : " + getColor());
        System.out.println("Vaccinated : " + isVaccinated());
    }
}
