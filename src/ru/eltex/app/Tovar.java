package ru.eltex.app;
import java.util.UUID;

abstract public class Tovar implements ICrudAction {

    public static void ID() {
        UUID id = UUID.randomUUID();
        System.out.println(id);
    }
}
