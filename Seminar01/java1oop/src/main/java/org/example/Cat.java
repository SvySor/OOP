package org.example;

public class Cat extends Animal {
    private String color;
    private Integer age;

    public Cat(String name, String color, Integer age) {
        this.name = name;
        this.color = color;
        if (age < 0) {
            System.out.println("Данные введены не корректно");
        } else {
            this.age = age;
        }
    }

    public Cat() {
        this.name = "Unknown";
        this.color = "Unknown";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age < 0) {
            System.out.println("Данные введены не корректно");
        } else {
            this.age = age;
        }
    }

    @Override
    public void voice() {
        System.out.println("Мяу");
    }
}
