package ru.eltex.app;

import java.util.Random;
import java.util.Scanner;

public class Pristavka extends Tovar {


    @Override
    public  void create() {
//        TV tv = new TV();
        System.out.print("Фирма: ");
        String[] fir = {"Denn", "Telefunken", "Ji"};
        Random random1 = new Random();
        int pos = random1.nextInt(fir.length);
        firm = fir[pos];
        System.out.println(firm);
        System.out.print("Модель: ");
        if (firm.equals("Denn")) {
            String[] mod = rand("DDT111", "DDT300", "DDT110", 899, 1400, 700 );
        } else if (firm.equals("Telefunken")) {
            String[] mod = rand("TF-DVBT213", "TF-DVBT219", "TF-DVBT217", 1199, 1599, 1999);
        } else if (firm.equals("Ji")) {
            String[] mod = rand("JT2-2700", "JT2-2701", "JT2-2702", 890, 999, 990);
        }
    }
    public  String[] rand(String a,String b,String c, int a1, int b1, int c1 ) {
        String[] texts = { a, b, c };
        Random random = new Random ();
        int pos1 = random.nextInt(texts.length);
        model = texts[pos1];
        System.out.println(model);
        if (texts[pos1].equals(a)){
            prise = a1;
            System.out.println("Цена: " + prise);
        } else if (texts[pos1].equals(b)){
            prise = b1;
            System.out.println("Цена: " + prise);
        } else if (texts[pos1].equals(c)){
            prise = c1;
            System.out.println("Цена: " + prise);
        }
        return texts;
    }

    @Override
    public void read() {

        System.out.println("ID: " + getID());
        System.out.println("Телеприставка");
        System.out.println("Фирма: " + firm);
        System.out.println("Модель: " + model);
        System.out.println("Цена: " + prise);
    }

    @Override
    public void update() {

        System.out.println("Телеприставка");
        System.out.println("Введите цену");
        Scanner scanner = new Scanner(System.in);
        prise = scanner.nextInt();
        System.out.println("Выберите фирму");
        firm = scanner.nextLine();
        firm = scanner.nextLine();
        System.out.println("Выберите модель");
        model = scanner.nextLine();

    }

    @Override
    public void delete() {
        prise = 0;
        firm = null;
        model = null;
        count--;
    }
}
