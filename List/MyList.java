package com.example.android.ex4_artem.List;

import com.example.android.ex4_artem.Human.Human;

public class MyList {
    private static MyList instance;

    public static MyList getInstance() {
        if (instance == null)
            instance = new MyList();
        return instance;
    }

    public void enumer() {
        ListDev listDev = new ListDev();
        listDev.addHumans();
        listDev.enumShow();
        listDev.showHumans();
    }

    public void iter() {
        ListDev listDev = new ListDev();
        listDev.addHumans();
        int ageToDelete = 13;
        System.out.println("Delete Human with age: " + listDev.iterDelByAge(ageToDelete));
        listDev.iterShow();
        listDev.showHumans();
    }

    public void listIter() {
        ListDev listDev = new ListDev();
        int ageToDelete = 7;
        listDev.addHumans();
        System.out.println("Delete Human with age: " + ageToDelete);
        listDev.listIterDelByAge(ageToDelete);

        int ageToSet = 26;
        int newAge = 10;
        StringBuilder newName = new StringBuilder("Kristina");

        Human human = new Human(newName.toString(), newAge);

        System.out.println("MySet Human with age: " + ageToSet);
        listDev.listIterSetByAge(human, ageToSet);

        newName.append(7);
        human = new Human("Artem", 24);
        System.out.println("Add Human: " + human);
        listDev.listIterAdd(human);
        listDev.listIterShow();
        listDev.showHumans();
    }

    public void comparable() {
        ListDev listDev = new ListDev();
        listDev.addHumans();

        listDev.comparableSortShow();
        listDev.comparableShuffleShow();
    }

    public void comparator() {
        ListDev listDev = new ListDev();
        listDev.addHumans();
        listDev.comparatorSortShow();
    }
}
