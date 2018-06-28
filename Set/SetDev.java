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

    public void addSet(int amount, Set<Human> set) {
        set.clear();
        for (int i = amount; i > 0; i--) {
            set.add(new Human("Name #" + randInt(amount), randInt(amount)));
        }
    }

    public static int randInt(int amount) {
        Random random = new Random();
        return random.nextInt(amount);
    }

    public void showHashSet() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Human human : hashSetHumans) {
            stringBuilder.append(human);
        }
        System.out.println(stringBuilder);
    }

    public void showTreeSet() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Human human : treeSetHumans) {
            stringBuilder.append(human);
        }
        System.out.println(stringBuilder);
    }

    public Set<Human> getHashSetHumans() {
        return hashSetHumans;
    }

    public Set<Human> getTreeSetHumans() {
        return treeSetHumans;
    }



    }

