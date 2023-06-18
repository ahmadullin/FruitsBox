package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;

class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public double getWeight() {
        double weight = 0.0;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<? extends Fruit> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }

    public void transfer(Box<T> box) {
        if (this == box) {
            return;
        }
        box.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
