package ru.eltex.app;

import java.util.Random;
import java.util.Scanner;

public class Pristavka extends Tovar {


    @Override
    public  void create() {
        System.out.print("Фирма: ");
        String[] firm = {"Denn", "Telefunken", "Ji"};
        Random random1 = new Random();
        int pos = random1.nextInt(firm.length);
        System.out.println(firm[pos]);
        System.out.print("Модель: ");
        if (firm[pos].equals("Denn")) {
            String[] model = TV.rand("DDT111", "DDT300", "DDT110", 899, 1400, 700 );
        } else if (firm[pos].equals("Telefunken")) {
            String[] model1 = TV.rand("TF-DVBT213", "TF-DVBT219", "TF-DVBT217", 1199, 1599, 1999);
        } else if (firm[pos].equals("Ji")) {
            String[] model2 = TV.rand("JT2-2700", "JT2-2701", "JT2-2702", 890, 999, 990);
        }
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
