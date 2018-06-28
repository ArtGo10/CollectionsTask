package com.example.android.ex4_artem.Human;

import java.util.Comparator;

public class HumanAgeComparator implements Comparator<Human> {
    @Override
    public int compare(Human human1, Human human2) {
        return Integer.compare(human1.getAge(), human2.getAge());
    }
}
