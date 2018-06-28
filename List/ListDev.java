package com.example.android.ex4_artem.List;

import com.example.android.ex4_artem.Human.Human;
import com.example.android.ex4_artem.Human.HumanAgeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class ListDev {
    private static List<Human> humans;

    ListDev() {
        humans = new ArrayList<>();
    }

    public void addHumans() {
        humans = new ArrayList<>();
        humans.add(new Human("Andrew", 26));
        humans.add(new Human("Victor",  31));
        humans.add(new Human("Valera",  15));
        humans.add(new Human("Denis",  18));
        humans.add(new Human("Kolya", 20));
        humans.add(new Human("Nadya",  7));
        humans.add(new Human("Sofia",  13));
        humans.add(new Human("Oleg", 45));
        humans.add(new Human("Julia",  29));
        humans.add(new Human("Nikita",  33));
        humans.add(new Human("Nastya",  6));

    }

    public void showHumans() {
        StringBuilder str = new StringBuilder("Default List: ");
        for (Human human : humans) {
            str.append(human).append(" ");
        }
        System.out.println(str);
    }

    public void enumShow() {
        Enumeration<Human> enumHuman = Collections.enumeration(humans);
        StringBuilder str = new StringBuilder();
        while (enumHuman.hasMoreElements()) {
            str.append(enumHuman.nextElement()).append("\n");
        }
        System.out.println(str);
    }

    public void iterShow() {
        Iterator<Human> humanIterator = humans.iterator();
        StringBuilder str = new StringBuilder();
        Human human;
        while (humanIterator.hasNext()) {
            human = humanIterator.next();
            if (human != null)
                str.append(human.toString()).append(("\n"));
        }

        System.out.println(str);
    }

    public void listIterShow() {
        ListIterator<Human> humanListIter = humans.listIterator();
        StringBuilder str = new StringBuilder();
        while (humanListIter.hasNext()) {
            Human human;
            human = humanListIter.next();
            if (human != null)
                str.append(human.toString()).append(("\n"));
        }
        System.out.println(str);
    }

    int iterDelByAge(int age) {
        Iterator<Human> humanIter = humans.iterator();
        while (humanIter.hasNext()) {
            if (humanIter.next().getAge() == age) {
                humanIter.remove();
            }
        }
        return age;
    }


    void listIterDelByAge(int age) {
        ListIterator<Human> humanListIter = humans.listIterator();
        while (humanListIter.hasNext()) {
            if (humanListIter.next().getAge() == age) {
                humanListIter.remove();
            }
        }
    }

    void listIterSetByAge(Human human, int age) {
        ListIterator<Human> humanListIter = humans.listIterator();
        while (humanListIter.hasNext()) {
            if (humanListIter.next().getAge() == age) {
                humanListIter.set(human);
            }
        }
    }

    void listIterAdd(Human human) {
        ListIterator<Human> humanListIter = humans.listIterator();
        humanListIter.add(human);
    }

    void comparableSortShow() {
        Collections.sort(humans);
        showHumans();
    }

    void comparableShuffleShow() {
        Collections.shuffle(humans);
        showHumans();
    }

    void comparatorSortShow() {
        Collections.shuffle(humans);
        showHumans();
        Collections.sort(humans, new HumanAgeComparator());
        showHumans();
    }
}
