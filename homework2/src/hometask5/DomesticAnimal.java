package hometask5;

public class DomesticAnimal extends Animal{



    private String name;

    private boolean isVaccinated;

    public DomesticAnimal(String name,boolean isVaccinated, int id, int age, int weight, String color) {
        super(id, age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    @Override
    public String voice() {
        return super.voice() + "my name is " + name + ".";
    }

    // Геттеры и Сеттеры
    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }
}
