package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Chest chest = new Chest(100, true);
        Berry berry = new Berry(20, true);
        Grass grass = new Grass(50, false);
        berry.grow(10);
        berry.isRightClick();
        grass.destroy(40);
        grass.getEndurance();
        ArrayList<Base> base = new ArrayList<>();
        base.add(chest);
        base.add(berry);
        base.add(grass);
        for (int i = 0; i < base.size(); i++) {
            base.get(i).isRightClick();
        }
    }
}
