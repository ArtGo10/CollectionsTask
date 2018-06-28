package com.example.android.ex4_artem;

import com.example.android.ex4_artem.List.MyList;
import com.example.android.ex4_artem.Map.MyMap;
import com.example.android.ex4_artem.Set.MySet;



public class Main {
    public static void main(String[] args) {
        myList();
        mySet();
        myMap();
    }

    private static void myList() {
        MyList myList = MyList.getInstance();

        System.out.println("Enumeration");
        myList.enumer();

        System.out.println("Iterator");
        myList.iter();

        System.out.println("ListIterator");
        myList.listIter();

        System.out.println("Comparable");
        myList.comparable();

        System.out.println("Comparator");
        myList.comparator();
    }

    private static void mySet() {
        MySet mySet = MySet.getInstance();

        System.out.println("HashSet");
        mySet.hashSet();

        System.out.println("TreeSet");
        mySet.treeSet();
    }

    private static void myMap() {
        MyMap myMap = MyMap.getInstance();
        System.out.println("HashMap");
        myMap.map();
        System.out.println("HashMap Iterator");
        myMap.mapIterator();
    }
}
