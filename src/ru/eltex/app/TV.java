package ru.eltex.app;
import java.util.Random;

public class TV extends Tovar {

    @Override

    public void create() {
        System.out.print("Фирма: ");
        String[] firm = {"LG", "Samsung", "Sony"};
        Random random1 = new Random();
        int pos = random1.nextInt(firm.length);
        System.out.println(firm[pos]);
        System.out.print("Модель: ");
        if (firm[pos].equals("LG")) {
            String[] model = rand("50UK6300PLB", "43UM7490PLC", "55UM7660PLA",36990, 34990, 59990);
        } else if (firm[pos].equals("Samsung")) {
            String[] model1 = rand("UE50RU7170U", "UE55RU7470U", "UE43N5510AU", 35990, 54990, 24990);
        } else if (firm[pos].equals("Sony")) {
            String[] model2 = rand("KD-43XG7096", "KDL-40WD653", "KD-49XF7096", 47990, 31990, 39990);
        }
    }



    public static String[] rand(String a,String b,String c, int a1, int b1, int c1 ) {
        String[] texts = { a, b, c };
        Random random = new Random ();
        int pos1 = random.nextInt(texts.length);
        System.out.println(texts[pos1]);
        if (texts[pos1].equals(a)){
                 System.out.print("Цена: " + a1);
            } else if (texts[pos1].equals(b)){
                 System.out.print("Цена: " + b1);
            } else if (texts[pos1].equals(c)){
                 System.out.print("Цена: " + c1);
            }
        return texts;
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




