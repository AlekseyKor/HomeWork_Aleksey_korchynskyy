package hometask6.animals;

import hometask6.DomesticAnimal;
import hometask6.GetInfo;

public class Dog extends DomesticAnimal implements GetInfo {

    public Dog(String name, boolean isVaccinated, int id, int age, double weight, String color) {
        super(name, isVaccinated, id, age, weight, color);
    }

    @Override
    public String voice(){
        System.out.println("Dog");
        return super.voice() + " Bow-wow!";
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
