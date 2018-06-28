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
        humans.clear();
        if (humans != null)
            for (int i = 0; i < MyList.N; i++) {
                humans.add(new Human("Name #" + i, i));
            }
    }

    public void showHumans() {
        StringBuilder stringBuilder = new StringBuilder(" List: ");
        stringBuilder.append(humans);
        System.out.println(humans);
    }

    public void enumShow() {
        Enumeration<Human> enumeration = Collections.enumeration(humans);
        StringBuilder stringBuilder = new StringBuilder(" Enumeration:\n");
        while (enumeration.hasMoreElements()) {
            stringBuilder.append(enumeration.nextElement()).append(System.lineSeparator());
        }
        System.out.println(stringBuilder);
    }

    public void iterShow() {
        Iterator<Human> humanIterator = humans.iterator();
        StringBuilder stringBuilder = new StringBuilder(" Iterator:\n");
        Human human;
        while (humanIterator.hasNext()) {
            human = humanIterator.next();
            if (human != null)
                stringBuilder.append(human.toString()).append(System.lineSeparator());
        }

        System.out.println(stringBuilder);
    }

    public void listIterShow() {
        ListIterator<Human> humanListIterator = humans.listIterator();
        StringBuilder stringBuilder = new StringBuilder(" Iterator:\n");
        Human human;
        while (humanListIterator.hasNext()) {
            human = humanListIterator.next();
            if (human != null)
                stringBuilder.append(human.toString()).append(System.lineSeparator());
        }
        System.out.println(stringBuilder);
    }

    int iterDelByAge(int age) {
        Iterator<Human> iterator = humans.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getAge() == age) {
                iterator.remove();
            }
        }
        return age;
    }


    void listIterDelByAge(int age) {
        ListIterator<Human> humanListIterator = humans.listIterator();
        while (humanListIterator.hasNext()) {
            if (humanListIterator.next().getAge() == age) {
                humanListIterator.remove();
            }
        }
    }

    void listIterSetByAge(Human human, int age) {
        ListIterator<Human> humanListIterator = humans.listIterator();
        while (humanListIterator.hasNext()) {
            if (humanListIterator.next().getAge() == age) {
                humanListIterator.set(human);
            }
        }
    }

    void listIterAdd(Human human) {
        ListIterator<Human> humanListIterator = humans.listIterator();
        humanListIterator.add(human);
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
