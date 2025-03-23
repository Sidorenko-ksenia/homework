package org.example;

class Fish extends Animal {

    @Override
    public void breathe() {
        System.out.println("Рыба дышит");
    }

    @Override
    public void move() {
        System.out.println("Рыба плавает в воде");
    }
}
