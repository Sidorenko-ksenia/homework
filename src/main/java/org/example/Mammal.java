package org.example;

class Mammal extends Animal {
    @Override
    public void breathe() {
        System.out.println("Зверь дышит");
    }

    @Override
    public void move() {
        System.out.println("Зверь передвивагется");
    }
}
