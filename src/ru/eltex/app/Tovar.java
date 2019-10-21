package ru.eltex.app;
import java.util.UUID;

abstract public class Tovar implements ICrudAction {

    protected int prise;
    protected String firm;
    protected String model;
    private UUID ID;

    public Tovar() {
        ID = UUID.randomUUID();
        count++;
    }

    public UUID getID() {
        return ID;
    }

    public Tovar(UUID ID) {
        this.ID = ID;
    }

    public static int count = 0;

}
