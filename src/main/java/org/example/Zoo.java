package org.example;

public class Zoo {
    public static void main(String[] args) {
        Animal tiger = new Mammal();
        Animal eagle = new Birds();
        Animal salmon = new Fish();

        System.out.println("Тигр");
        tiger.move();
        tiger.breathe();

        System.out.println("Орел");
        eagle.move();
        eagle.breathe();

        System.out.println("Лосось");
        salmon.move();
        salmon.breathe();
    }

}