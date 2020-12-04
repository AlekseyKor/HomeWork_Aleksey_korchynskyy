package hometask6.animals;

import hometask6.DomesticAnimal;
import hometask6.GetInfo;
import hometask6.GuideHome;

public class GuideDog extends DomesticAnimal implements GetInfo, GuideHome {

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
    @Override
    public String guideHome() {
        if (isTrained){
            return "I will take you home!";
        }else {
            return "I'm not trained yet.";
        }
    }
}
