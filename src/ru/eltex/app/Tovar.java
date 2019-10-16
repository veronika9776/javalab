package ru.eltex.app;
import java.util.UUID;

abstract public class Tovar implements ICrudAction {

    public static void ID() {
        UUID id1 = UUID.randomUUID();
        UUID id2 = UUID.randomUUID();
        System.out.println(id1);
        System.out.println(id2);
    }
}
