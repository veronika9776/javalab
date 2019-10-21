package ru.eltex.app;
import java.util.Random;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        String[] firm = {"Телевизор", "Игровая консоль", "Телеприставка"};
        Random random1 = new Random();
        int pos = random1.nextInt(firm.length);
        System.out.println(firm[pos]);
        Tovar tov = null;
        if (firm[pos].equals("Телевизор")) {
            tov = new TV();
        } else if (firm[pos].equals("Игровая консоль")) {
            tov = new Consol();
        } else if (firm[pos].equals("Телеприставка")) {
            tov = new Pristavka();
        }

        tov.create();
        System.out.println("");
        tov.read();
        System.out.println("");
        tov.update();
        System.out.println("");
        tov.read();

//        System.out.println("Введите объект");
//        Scanner tovar = new Scanner(System.in);
//        String val = tovar.nextLine();
//
//        System.out.println("Количество товара");
//        Scanner kol = new Scanner(System.in);
//        int val1 = kol.nextInt();
//
//
//        for (int i = 1; i <= val1; i++) {
//            if (val.equals("Телевизор")) {
//                TV tv = new TV();
//                tv.read();
//            } else if (val.equals("Игровая консоль")) {
//                Consol con = new Consol();
//                con.read();
//            } else if (val.equals("Телеприставка")) {
//                Pristavka pris = new Pristavka();
//                pris.read();
//            }
//        }

        // System.out.println( args[0] );
        // System.out.print(args[1]);


    }
}

