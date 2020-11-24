package hometask5;

import hometask5.allAnimals.*;

public class AnimalMain {
    public static void main(String[] args) {

        Cat cat = new Cat("Puss", true, 1, 5, 8, "Black");
        System.out.println(cat.voice());
        getInfo(cat);

        System.out.println("=======================================");

        Dog dog = new Dog("Sharik", true, 9, 4, 9, "White & Black");
        System.out.println(dog.voice());
        getInfo(dog);

        System.out.println("=======================================");

        Fish fish = new Fish("Dori", true, 2, 2, 1, "Yellow");
        System.out.println(fish.voice());
        getInfo(fish);

        System.out.println("=======================================");

        Crocodile crocodile = new Crocodile(true, 3, 10, 48, "Green");
        System.out.println(crocodile.voice());
        getInfo(crocodile);

        System.out.println("=======================================");

        Giraffe giraffe = new Giraffe(false, 4, 12, 140, "Brown");
        System.out.println(giraffe.voice());
        getInfo(giraffe);


        System.out.println("=======================================");

        GuideDog guideDog = new GuideDog("Good Boy", true, true, 5, 7, 20, "White");
        System.out.println(guideDog.voice());
        getInfo(guideDog);

        System.out.println("=======================================");

        Hamster hamster = new Hamster("Napkin", true, 6, 3, 1, "Brown");
        System.out.println(hamster.voice());
        getInfo(hamster);

        System.out.println("=======================================");

        Lion lion = new Lion(true, 7, 8, 40, "Yellow");
        System.out.println(lion.voice());
        getInfo(lion);

        System.out.println("=======================================");

        Wolf wolf = new Wolf(true, 8, 11, 28, "Grey");
        System.out.println(wolf.voice());
        getInfo(wolf);


    }

    public static void getInfo(Animal name){
        System.out.println("ID : " + name.getId());
        System.out.println("Age : " + name.getAge());
        System.out.println("Weight : " + name.getWeight() + " kg");
        System.out.println("Color : " + name.getColor());
    }
}
