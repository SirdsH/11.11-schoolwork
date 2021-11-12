package com.company;

public class Grass extends Base {
    public Grass(int endurance, boolean rightClick) {
        super(endurance, rightClick);
    }

    @Override
    public void destroySound() {
        System.out.println("You have destroyed grass!");
    }
}
