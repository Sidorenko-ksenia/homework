package org.example;

class Birds extends Animal {
    @Override
    public void breathe() {
        System.out.println("Птица дышит");
    }

    @Override
    public void move() {
        System.out.println("Птица летает в воздухе");
    }
}
