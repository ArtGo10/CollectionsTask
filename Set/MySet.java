package com.example.android.ex4_artem.Set;

public class    MySet {
    private static final int N = 40;

    private static MySet instance;

    public static MySet getInstance() {
        if (instance == null)
            instance = new MySet();
        return instance;
    }

    public void hashSet(){
        SetDev setDev = new SetDev();
        setDev.addSet(setDev.getHashSetHumans());
        setDev.showHashSet();
    }

    public void treeSet(){
        SetDev setDev = new SetDev();
        setDev.addSet(setDev.getTreeSetHumans());
        setDev.showTreeSet();
    }
}
