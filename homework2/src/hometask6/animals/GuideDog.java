package hometask6.animals;

import hometask6.DomesticAnimal;
import hometask6.GetInfo;

public class GuideDog extends DomesticAnimal implements GetInfo {

    private boolean isTrained;

    public GuideDog(String name,boolean isTrained, boolean isVaccinated, int id, int age, double weight, String color) {
        super(name, isVaccinated, id, age, weight, color);
        this.isTrained = isTrained;
    }

    @Override
    public String voice(){
        System.out.println("Guide-dog");
        return super.voice() + " If I'm trained then I will take you home.";
    }

    @Override
    public void info() {
        System.out.println("ID : " + getId());
        System.out.println("Age : " + getAge());
        System.out.println("Weight : " + getWeight() + " kg");
        System.out.println("Color : " + getColor());
        System.out.println("Vaccinated : " + isVaccinated());
        System.out.println("Trained : " + isTrained());
    }

    // Геттеры и Сеттеры
    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    // Методы
    public void guideHome(){
        if (isTrained) System.out.println("Let's go!");
        else System.out.println("I'm not trained yet.");
    }
}
