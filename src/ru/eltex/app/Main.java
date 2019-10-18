package ru.eltex.app;
import java.util.Random;
import java.util.Scanner;


public class Main {



    public static void main(String[] args) {

        Tovar.ID();
        String[] firm = {"Телевизор", "Игровая консоль", "Телеприставка"};
        Random random1 = new Random();
        int pos = random1.nextInt(firm.length);
        System.out.println(firm[pos]);
        if (firm[pos].equals("Телевизор")) {
            TV tv = new TV() ;
            tv.create();
        } else if (firm[pos].equals("Игровая консоль")) {
            Consol con = new Consol() ;
            con.create();
        } else if (firm[pos].equals("Телеприставка")) {
            Pristavka pr = new Pristavka();
            pr.create();

        }


//        System.out.println(qty.nextInt());

//        int n = Integer.parseInt(args[1]);
//
//        for (int i = 1; i <= val; i++) {
//            if (val1.equals("Телевизор")) {
//                TV tv = new TV();
//                tv.read();
//            } else if (val1.equals("Игровая консоль")) {
//                Consol con = new Consol();
//            } else if (val1.equals("Телеприставка")) {
//                Pristavka pris = new Pristavka();
//            }
//        }

        // System.out.println( args[0] );
        // System.out.print(args[1]);


    }
}
