package ru.eltex.app;

import java.util.Random;
import java.util.Scanner;

public class Consol extends Tovar {


    @Override
    public void create() {

            System.out.print("Фирма: ");
            String[] fir = {"PlayStation", "Microsoft", "Nintendo"};
            Random random1 = new Random();
            int pos = random1.nextInt(fir.length);
            firm = fir[pos];
            System.out.println(firm);
            System.out.print("Модель: ");
            if (firm.equals("PlayStation")) {
                String[] mod = rand("4", "3", "Сlassic", 25990, 15990, 2990  );
            } else if (firm.equals("Microsoft")) {
                String[] mod = rand("Xbox 360", "Xbox One X", "Xbox One S", 10990, 39990, 23990);
            } else if (firm.equals("Nintendo")) {
                String[] mod = rand("Switch", "Classic Mini", "2DS", 16490, 3990, 11990);
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
        System.out.println("Игровая консоль");
        System.out.println("Фирма: " + firm);
        System.out.println("Модель: " + model);
        System.out.println("Цена: " + prise);
    }

    @Override
    public void update() {
        System.out.println("Игровая консоль");
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
