package com.campusdual.classroom;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    private static final String[] ELEMENTS = {
            "ELEMENT KPRBC", "ELEMENT YPBTM", "ELEMENT AADXU", "ELEMENT RXCGJ", "ELEMENT WYMVD",
            "ELEMENT WFGEJ", "ELEMENT TYGBS", "ELEMENT MAPTK", "ELEMENT GJXVE", "ELEMENT BAFGL"
    };

    public static Set<String> createHashSet() {
        Set<String> hashSet = new HashSet<>();

        Collections.addAll(hashSet, ELEMENTS);

        return hashSet;
    }

    public static Set<String> createTreeSet() {
        Set<String> treeSet = new TreeSet<>();

        Collections.addAll(treeSet, ELEMENTS);

        return treeSet;
    }

    private static void printSet(Set<String> customSet) {
        customSet.forEach(System.out::println);
    }

    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        // Devuelve false si el elemento ya existía en el conjunto
        return set.add(elementToAdd);
    }

    public static void main(String[] args) {
        Set<String> hashSet = createHashSet();
        Set<String> treeSet = createTreeSet();

        String elementToAdd = "ELEMENT AAA";
        addElementToSet(hashSet, elementToAdd);
        addElementToSet(treeSet, elementToAdd);

        printSet(hashSet);
        printSet(treeSet);
    }

}
