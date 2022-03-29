package com.otus.javahm;

import static com.otus.javahm.Commands.*;
import static com.otus.javahm.Commands.ADD;
import static com.otus.javahm.Commands.LIST;
import static com.otus.javahm.Commands.EXIT;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        List<Animal> animals = new ArrayList<>();


        Scanner sc = new Scanner(System.in);

        String chose;


        while (true) {

            System.out.println("Выбери команду add/list/exit");
            chose = sc.next().toLowerCase(Locale.ROOT).trim();
            switch (chose) {
                case "add":
                    System.out.println("Какое животное выберешь? cat / dog / duck ?");
                    String animalType = sc.next();
                    Animal animal = new Animal();

                    if (animalType.equals("cat")) {
                        animal = new Cat();
                        generateAnimal(animal, sc);
                    } else if (animalType.equals("dog")) {
                        animal = new Dog();
                        generateAnimal(animal, sc);
                    } else if (animalType.equals("duck")) {
                        animal = new Duck();
                        generateAnimal(animal, sc);
                    }
                    animal.add(animal);
                    animal.say();
                    break;
                case "list":
                    System.out.println(animals.toString());

                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong enter");
            }
        }
    }

    public static void generateAnimal(Animal animal, Scanner scanner) {
        System.out.println("Введите имя");
        animal.setName(scanner.next());
        System.out.println("Введите возвраст");
        animal.setAge(scanner.nextInt());
        System.out.println("Введите вес");
        animal.setWeight(scanner.nextInt());
        System.out.println("Введите цвет");
        animal.setColor(scanner.next());
    }
}