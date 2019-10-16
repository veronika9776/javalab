package ru.eltex.app;

import java.util.Scanner;

public class Pristavka extends Tovar {
    public Pristavka() {
        System.out.println("Pristavka");
    }

    @Override
    public void create() {

    }

    @Override
    public void read() {

    }

    @Override
    public void update() {

        System.out.println("Введите цену");
        Scanner price = new Scanner(System.in);
        int val = price.nextInt();
        System.out.println("Количестово товара");
        Scanner qty = new Scanner(System.in);
        int val1 = qty.nextInt();
        System.out.println("Выберите фирму");
        Scanner firm = new Scanner(System.in);
        String val2 = firm.nextLine();
        System.out.println("Выберите модель");
        Scanner model = new Scanner(System.in);
        String val3 = model.nextLine();

    }

    @Override
    public void delete() {

    }
}
