package ru.eltex.app;

import java.util.Random;

public class Consol extends Tovar {


    @Override
    public void create() {
            System.out.print("Фирма: ");
            String[] firm = {"PlayStation", "Microsoft", "Nintendo"};
            Random random1 = new Random();
            int pos = random1.nextInt(firm.length);
            System.out.println(firm[pos]);
            System.out.print("Модель: ");
            if (firm[pos].equals("PlayStation")) {
                String[] model = TV.rand("4", "3", "Сlassic", 25990, 15990, 2990  );
            } else if (firm[pos].equals("Microsoft")) {
                String[] model1 = TV.rand("Xbox 360", "Xbox One X", "Xbox One S", 10990, 39990, 23990);
            } else if (firm[pos].equals("Nintendo")) {
                String[] model2 = TV.rand("Switch", "Classic Mini", "2DS", 16490, 3990, 11990);
            }

    }

    @Override
    public void read() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
