package com.company;

public class Chest extends Base implements IOpen {
    public Chest(int endurance, boolean rightClick) {
        super(endurance, rightClick);
    }

    @Override
    public void destroySound() {
        System.out.println("Chest has been destroyed!");
    }

    @Override
    public void open() {
        System.out.println("You have opened chest!");
    }
}
