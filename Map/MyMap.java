package com.example.android.ex4_artem.Map;

public class MyMap {
    private static MyMap instance;

    private MyMap() {
    }

    public static MyMap getInstance() {

        if (instance == null)
            instance = new MyMap();

        return instance;
    }

    public void map() {
        MapDev map = new MapDev();
        map.addMap();
        map.showKeySet();
        map.showValueCollection();
        map.showEntrySetMap();
    }

    public void mapIterator() {
        MapDev map = new MapDev();
        map.addMap();
        map.showEntrySetMap();
        int ageOfHuman = map.removeEntryIterator(19);
        System.out.println("Delete human with age: " + ageOfHuman);
        map.showEntrySetIterator();
    }
}
