package hometask6;

public class WildAnimal extends Animal implements Voice {

    private boolean isPredator;

    public WildAnimal(boolean isPredator, int id, int age, double weight, String color) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    @Override
    public String voice() {

        if (isPredator == true){
            return "Hello. I am a wild animal, and i am angry";
        }else return "Hello. I am a wild animal.";

    }
}
