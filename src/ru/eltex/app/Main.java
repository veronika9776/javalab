package ru.eltex.app;

public class Main {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[1]);

        for (int i = 1; i <= n; i++) {
            if (args[0].equals("TV")) {
                TV tv = new TV();
            } else if (args[0].equals("Consol")) {
                Consol con = new Consol();
            } else if (args[0].equals("Pristavka")) {
                Pristavka pris = new Pristavka();
            }
        }

       // System.out.println( args[0] );
        // System.out.print(args[1]);

    }
}
