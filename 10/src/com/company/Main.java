package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();
        set1.add("Orest");
        set1.add("Nikita");
        set1.add("Ihor");
        set1.add("Ivan");
        set2.add("Marichka");
        set2.add("Petro");
        set2.add("Orest");
        set2.add("Alla");
        set2.add("Vasyl");

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Union set: " + union(set1, set2) + "\n");
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Intersected set: " + intersect(set1, set2) + "\n");

        Map<String, String> personMap = new HashMap();

        personMap.put("Petrenko", "Orest");
        personMap.put("Zhuravel", "Nikita");
        personMap.put("Ivanenko", "Ihor");
        personMap.put("Chernenko", "Ivan");
        personMap.put("Mykhailyuk", "Marichka");
        personMap.put("Mazur", "Petro");
        personMap.put("Orlovsky", "Dasha");
        personMap.put("Melnyk", "Orest");
        personMap.put("Boyko", "Alla");
        personMap.put("Shevchuk", "Vasyl");

        System.out.println("The map: " + personMap + "\n");

        System.out.println("Are the names the same?");

        HashSet<String> firstNames = new HashSet<String>();
        for (String value : personMap.values()) {
            firstNames.add(value);
        }
        if (personMap.values().size() != firstNames.size()){
            System.out.println("Yes\n");
        }
        else System.out.println("No\n");

        for (Iterator<String> iterator = personMap.values().iterator(); iterator.hasNext(); ) {
            String value = iterator.next();
            if (value == "Orest") {
                iterator.remove();
            }
        }
        System.out.println("Changed map(all Orest values deleted): " + personMap);
    }

    public static Set<String> union(Set set1, Set set2) {
        Set<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static Set<String> intersect(Set set1, Set set2) {
        Set<String> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        return intersectSet;
    }
}