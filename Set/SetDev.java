package com.example.android.ex4_artem.Set;

import com.example.android.ex4_artem.Human.Human;
import com.example.android.ex4_artem.Main;
import com.example.android.ex4_artem.Human.HumanAgeComparator;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;
import java.util.Set;


public class SetDev {
    private Set<Human> hashSetHumans;
    private Set<Human> treeSetHumans;

    SetDev() {
        hashSetHumans = new HashSet<>();
        treeSetHumans = new TreeSet<>(new HumanAgeComparator());
    }

    public void addSet(Set<Human> set) {
        set.add(new Human("Andrew", 26));
        set.add(new Human("Victor",  31));
        set.add(new Human("Valera",  15));
        set.add(new Human("Denis",  18));
        set.add(new Human("Kolya", 20));
        set.add(new Human("Nadya",  7));
        set.add(new Human("Sofia",  13));
        set.add(new Human("Oleg", 45));
        set.add(new Human("Julia",  29));
        set.add(new Human("Nikita",  33));
        set.add(new Human("Nastya",  6));
    }

    public void showHashSet() {
        StringBuilder str = new StringBuilder();
        for (Human human : hashSetHumans) {
            str.append(human).append(" ");
        }
        System.out.println(str);
    }

    public void showTreeSet() {
        StringBuilder str = new StringBuilder();
        for (Human human : treeSetHumans) {
            str.append(human).append(" ");
        }
        System.out.println(str);
    }

    public Set<Human> getHashSetHumans() {
        return hashSetHumans;
    }

    public Set<Human> getTreeSetHumans() {
        return treeSetHumans;
    }



    }

