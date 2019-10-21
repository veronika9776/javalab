package ru.eltex.app;
import java.util.Random;
import java.util.Scanner;

public class TV extends Tovar {

    private int diagonal;
//    private String firm;
//    private String model;
    public TV() {
        super();
        this.diagonal = 30;
    }


    public TV(int diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public void create() {

        System.out.print("Фирма: ");
        String[] fir = {"LG", "Samsung", "Sony"};
        Random random1 = new Random();
        int pos = random1.nextInt(fir.length);
        firm = fir[pos];
        System.out.println(firm);
        System.out.print("Модель: ");
        if (firm.equals("LG")) {
            String[] mod = rand("50UK6300PLB", "43UM7490PLC", "55UM7660PLA",36990, 34990, 59990);
        } else if (firm.equals("Samsung")) {
            String[] mod = rand("UE50RU7170U", "UE55RU7470U", "UE43N5510AU", 35990, 54990, 24990);
        } else if (firm.equals("Sony")) {
            String[] mod = rand("KD-43XG7096", "KDL-40WD653", "KD-49XF7096", 47990, 31990, 39990);
        }
    }



    public  String[] rand(String a, String b, String c, int a1, int b1, int c1 ) {
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
        System.out.println("Телевизор");
        System.out.println("Фирма: " + firm);
        System.out.println("Модель: " + model);
        System.out.println("Цена: " + prise);
    }

    @Override
    public void update() {
        System.out.println("Телевизор");
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




