package org.example;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
//        cat1.name = "Basilar";
//        cat1.color = "Red-hair";
//        cat1.age = 4;
//        System.out.println("Cat1 name: " + cat1.name + ", color: " + cat1.color + ", age: " + cat1.age);

        Cat cat2 = new Cat();
        cat2.setName("Murky");
        cat2.setColor("Black");
        cat2.setAge(2);
        System.out.println("Cat2 name: " + cat2.getName() + ", color: " + cat2.getColor() + ", age: " + cat2.getAge());
        cat2.setAge(-10);
        System.out.println("Cat2 name: " + cat2.getName() + ", color: " + cat2.getColor() + ", age: " + cat2.getAge());
        Cat cat3 = new Cat("Pound", "white", -14);
        System.out.println("Cat3 name: " + cat3.getName() + ", color: " + cat3.getColor() + ", age: " + cat3.getAge());
        cat1.voice();
        cat1.jump();
        cat1.animalInfo();
    }
}