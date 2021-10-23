package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException
    {
        /*Part 1*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть радіус: ");

        double radius = sc.nextDouble();

        double area = Math.PI * (radius * radius);
        System.out.println("Площа кола дорівнює: " + area);

        double circumference= Math.PI * 2*radius;
        System.out.println("Довжина кола дорівнює: " + circumference) ;

        /*Part 2*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nЯк тебе звати?");
        String name = reader.readLine();
        System.out.println("Де ти живеш, " + name + "?");
        String adres = reader.readLine();
        System.out.println(name + ", ти живеш за адресою: " + adres);

        /*Part 3*/

        System.out.println("\nВведіть вартість першого дзвінка: ");
        int c1 = sc.nextInt();
        System.out.println("Введіть вартість другого дзвінка: ");
        int c2 = sc.nextInt();
        System.out.println("Введіть вартість третього дзвінка: ");
        int c3 = sc.nextInt();
        System.out.println("Введіть тривалість першого дзвінка у хвилинах: ");
        int t1 = sc.nextInt();
        System.out.println("Введіть тривалість другого дзвінка у хвилинах: ");
        int t2 = sc.nextInt();
        System.out.println("Введіть тривалість третього дзвінка у хвилинах: ");
        int t3 = sc.nextInt();

        int v1, v2, v3, v;
        v1 = c1 * t1;
        v2 = c2 * t2;
        v3 = c3 * t3;
        v = v1 + v2 + v3;
        System.out.println("\nВсього до сплати " + v);
    }


}
