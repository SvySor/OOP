package org.example;
//Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
//        Домашнее задание на закрепление:
//        1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//        2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
//        3)Создать класс Basket, содержащий массив купленных товаров.
//        4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
//        5)Вывести на консоль каталог продуктов. (все продукты магазина)
//        6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Coffee Equator", 9.55, 4);
        System.out.println(product1);
    }
}