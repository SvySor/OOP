package org.example;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("qwe", "asd", 21);
        //па полям
//        cat.name = "Тиша";
//        cat.color = "Black";
//        cat.age = 21;
        //инкапсулировали
        cat.setName("Тиша");
        cat.setColor("Black");
        cat.setAge(31);
//        System.out.println("cat = " + cat);
        cat.jump();
        cat.voice();
        cat.animalInfo();

        Cat cat1 = new Cat("Тиша", "красный", 6);
        cat1.voice();
        Dog dog = new Dog();
        dog.voice();
        Animal cat3 = new Cat("a", "b", 1);
        Animal dog2 = new Dog();
        ((Cat) cat3).catMethod();
        Animal[] catsAndDogs = {
                new Cat("1", "2", 3),
                new Dog()
        };
        for (Animal o : catsAndDogs) {
            if (o instanceof Cat) {
                System.out.println("кот");
            } else System.out.println(" не кот");
        }

    }

}