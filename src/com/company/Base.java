package com.company;

abstract public class Base {
    private int endurance;
    private boolean rightClick;

    public Base(int endurance, boolean rightClick) {
        this.endurance = endurance;
        this.rightClick = rightClick;
    }

    public void destroy(int a) {
        endurance -= a;
    }

    public abstract void destroySound();

    public void getEndurance() {
        if (endurance <= 0) {
            destroySound();
        } else System.out.println(endurance);
    }

    public void isRightClick() {
        if (rightClick == false)
            System.out.println("You can't use right click on this block");
        else System.out.println("You can use right click on this block");
    }
}
