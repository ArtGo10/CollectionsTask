package com.example.android.ex4_artem.Map;

import com.example.android.ex4_artem.Human.Human;
import com.example.android.ex4_artem.Human.Child;
import com.example.android.ex4_artem.Set.SetDev;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class MapDev {
    private Map<Human, Child> humanMap;

    MapDev() {
        humanMap = new HashMap<>();
    }

    public void addMap(int amount) {
        humanMap.clear();
        for (int i = 0; i < amount; i++) {
            humanMap.put(
                    new Human("Name #" + SetDev.randInt(amount), SetDev.randInt(amount)),
                    new Child("ChildName #" + SetDev.randInt(amount)));
        }
    }


    public void showKeySet() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Key set: ");
        for (Human entity : humanMap.keySet()) {
            stringBuilder.append(entity.toString()).append(System.lineSeparator());
        }
        System.out.println(stringBuilder.toString());
    }

    public void showValueCollection() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Value collection: ");
        for (Child entity : humanMap.values()) {
            stringBuilder.append(entity).append(System.lineSeparator());
        }
        System.out.println(stringBuilder);
    }

    public void showEntrySetMap() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Entry set: ");
        for (Map.Entry<Human, Child> entity : humanMap.entrySet()) {
            stringBuilder.append(entity.getKey()).append(entity.getValue()).append(System.lineSeparator());
        }
        System.out.println(stringBuilder);
    }

    public int removeEntryIterator(int age) {
        Iterator<Map.Entry<Human, Child>> iterator = humanMap.entrySet().iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getKey().getAge() == age)
                iterator.remove();
        }

        return age;
    }

    public void showEntrySetIterator() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Human, Child> entry : humanMap.entrySet()) {
            stringBuilder.append(entry.getKey()).append(entry.getValue()).append(System.lineSeparator());
        }
        System.out.println(stringBuilder.toString());
    }
}
