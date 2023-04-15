package org.example;
//Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
//        Домашнее задание на закрепление:
//        1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//        2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
//        3)Создать класс Basket, содержащий массив купленных товаров.
//        4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
//        5)Вывести на консоль каталог продуктов. (все продукты магазина)
//        6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        Category category1 = new Category("Coffee");
        Product product1 = new Product("Ephiopia Sidamo", 529.55, 4);
        Product product2 = new Product("Brazilia Serrado", 409.55, 3);
        Product product3 = new Product("Guatemala La Nueva Era", 699.55, 5);
        category1.getProducts().put(product1, 17);
        category1.getProducts().put(product2, 32);
        category1.getProducts().put(product3, 15);
        System.out.println(category1);

        Category category2 = new Category("Tee");
        Product product4 = new Product("English Breakfast", 285.00, 3);
        Product product5 = new Product("Dshamira TGFOP", 440.43, 4);
        Product product6 = new Product("Amguri FTGFOP", 645.12, 5);
        category2.getProducts().put(product4, 345);
        category2.getProducts().put(product5, 43);
        category2.getProducts().put(product6, 2);

        User user1 = new User("Vasia", "12345", new Basket());
        user1.getMybasket().setBasketID(1);
        User user2 = new User("Nikolai", "1111", new Basket());
        user1.getMybasket().setBasketID(2);

        List<Category> Stock = new ArrayList<>();
        Stock.add(category1);
        Stock.add(category2);
        System.out.println("Каталог продуктов");
        for (Category category : Stock) {
            System.out.println(category);
        }

        List<User> Customers = new ArrayList<>();
        Customers.add(user1);
        Customers.add(user2);
        System.out.println("Клиенты");
        for (User customer : Customers) {
            System.out.println(customer);
        }
    }
}
