package hometask5.allAnimals;

import hometask5.DomesticAnimal;

public class GuideDog extends DomesticAnimal {

    private boolean isTrained;

    public GuideDog(String name,boolean isTrained, boolean isVaccinated, int id, int age, int weight, String color) {
        super(name, isVaccinated, id, age, weight, color);
        this.isTrained = isTrained;
    }


    // Геттеры и Сеттеры
    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    @Override
    public String voice() {

        if (isTrained == true){
            return super.voice() + " I can take you home.";
        }else return super.voice();

    }

    // Методы
    public void guideHome(){
        System.out.println("Let's go!");
    }
}
