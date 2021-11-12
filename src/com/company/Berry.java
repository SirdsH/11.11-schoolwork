package com.company;

public class Berry extends Base implements Grow{
    public Berry(int endurance, boolean rightClick) {
        super(endurance, rightClick);
    }

    @Override
    public void destroySound() {
        System.out.println("You have destroyed berry!");
    }

    @Override
    public void grow(int a) {
        int b = 0;
        int end = 10;
        int until = end -= a;
        b += a;
        if (b == 10) {
            System.out.println("You can eat it now");
        } else System.out.println("you can't eat it yet. You need to grow it " + until + " more times!");
    }
}
