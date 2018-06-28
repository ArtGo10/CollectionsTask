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

    public void addMap() {
        humanMap = new HashMap<>();
        humanMap.put(new Human("Andrew", 26), new Child("Boris"));
        humanMap.put(new Human("Denis", 35), new Child("Vika"));
        humanMap.put(new Human("Valera", 19), new Child("Kristina"));
        humanMap.put(new Human("Artem", 24), new Child("Kolya"));
        humanMap.put(new Human("Oleg", 54), new Child("Stepan"));
        humanMap.put(new Human("Kirill", 21), new Child("Vitya"));
        humanMap.put(new Human("Nikita", 46), new Child("Margo"));
        humanMap.put(new Human("Oliver", 23), new Child("Snezhana"));
        humanMap.put(new Human("Vitalik", 28), new Child("Miya"));
        humanMap.put(new Human("Milana", 41), new Child("Sergey"));
        humanMap.put(new Human("Pavel", 61), new Child("Oksana"));
        humanMap.put(new Human("Dima", 17), new Child("Stepan"));
        }


    public void showKeySet() {
        StringBuilder str = new StringBuilder();
        System.out.println("Key set: ");
        for (Human entity : humanMap.keySet()) {
            str.append(entity.toString()).append("\n");
        }
        System.out.println(str.toString());
    }

    public void showValueCollection() {
        StringBuilder str = new StringBuilder();
        System.out.println("Value collection: ");
        for (Child entity : humanMap.values()) {
            str.append(entity).append("\n");
        }
        System.out.println(str);
    }

    public void showEntrySetMap() {
        StringBuilder str = new StringBuilder();
        System.out.println("Entry set: ");
        for (Map.Entry<Human, Child> entity : humanMap.entrySet()) {
            str.append(entity.getKey()).append(" ").append(entity.getValue()).append("\n");
        }
        System.out.println(str);
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
        StringBuilder str = new StringBuilder();
        for (Map.Entry<Human, Child> entry : humanMap.entrySet()) {
            str.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n");
        }
        System.out.println(str.toString());
    }
}
