package hometask5;

public class WildAnimal extends Animal{

    private boolean isPredator;

    public WildAnimal(boolean isPredator, int id, int age, int weight, String color) {
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
            return super.voice() + "I am a wild animal, and i am angry";
        }else return super.voice() + "I am a wild animal ";

    }
}
