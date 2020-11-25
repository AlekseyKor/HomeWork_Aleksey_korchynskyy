package hometask6;

import hometask6.animals.*;

public class AnimalMain {
    public static void main(String[] args) {

        Cat cat = new Cat("Sugar", true, 8784, 8, 5, "White");
        System.out.println(cat.voice());
        cat.info();

        System.out.println("==================================");

        Crocodile crocodile = new Crocodile(true, 2186, 7, 36.7, "Green");
        System.out.println(crocodile.voice());
        crocodile.info();

        System.out.println("==================================");

        Dog dog = new Dog("Pesik", false, 1238, 6, 4.8, "Black");
        System.out.println(dog.voice());
        dog.info();

        System.out.println("==================================");

        Fish fish = new Fish("Billy", false, 8743, 2, 0.74, "Orange");
        System.out.println(fish.voice());
        fish.info();

        System.out.println("==================================");

        Giraffe giraffe = new Giraffe(false, 87652, 15, 475, "Yellow & Brown");
        System.out.println(giraffe.voice());
        giraffe.info();

        System.out.println("==================================");

        GuideDog guideDog = new GuideDog("Sardelka", true, true, 68465, 6, 7.6, "Brown");
        System.out.println(guideDog.voice());
        guideDog.info();
        guideDog.guideHome();

        System.out.println("==================================");

        Hamster hamster = new Hamster("Boris", true, 83417, 4, 0.321, "Light-brown");
        System.out.println(hamster.voice());
        hamster.info();

        System.out.println("==================================");

        Lion lion = new Lion(true, 1235, 12, 130, "Yellow & Orange");
        System.out.println(lion.voice());
        lion.info();

        System.out.println("==================================");

        Wolf wolf = new Wolf(true, 6718, 16, 48, "Black");
        System.out.println(wolf.voice());
        wolf.info();


    }
}
