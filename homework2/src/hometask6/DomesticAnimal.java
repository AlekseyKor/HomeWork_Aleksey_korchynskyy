package hometask6;

public class DomesticAnimal extends Animal{

    private String name;
    private boolean isVaccinated;

    public DomesticAnimal(String name,boolean isVaccinated, int id, int age, double weight, String color) {
        super(id, age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    // Геттеры и Сеттеры
    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public String getName() {
        return name;
    }

    @Override
    public String voice(){
        return super.voice() + "my name is " + name + ".";
    }
}
