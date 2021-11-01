package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Student student1 = new Student("Orest", 1);
        Student student2 = new Student("Nikita", 2);
        Student student3 = new Student("Marichka", 4);
        Student student4 = new Student("Alla", 1);
        Student student5 = new Student("Ihor", 3);
        List<Student> students = new ArrayList<Student>() {{
            add(student1);
            add(student2);
            add(student3);
            add(student4);
            add(student5);
        }};

        System.out.println("Students:\n" + students.toString() + "\n");

        Comparator<Student> compareByName = new StudentNameComparator();
        students.sort(compareByName);
        System.out.println("Students are sorted by name:\n" + students.toString() + "\n");

        Comparator<Student> compareByCourse = new StudentCourseComparator();
        Collections.sort(students, compareByCourse);
        System.out.println("Students are sorted by course:\n" + students.toString() + "\n");

        System.out.print("Enter course number to see students from it: ");
        int courseNumber = Integer.parseInt(reader.readLine());
        System.out.printf("Students from %d course:\n", courseNumber);
        student1.printStudents(students, courseNumber);
    }
}