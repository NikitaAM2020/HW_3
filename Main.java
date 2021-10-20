package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();
        System.out.print("Input c: ");
        int c = in.nextInt();
        System.out.print("Input x: ");
        int x = in.nextInt();
        System.out.print("Input y: ");
        int y = in.nextInt();
        if (a<=x && b<=y || b<=x && a<=y || a<=x && c<=y || c<=x && a<=y || c<=x && b<=y || b<=x && c<=y)
            System.out.print("\nthe brick will pass");
        else
            System.out.print("\nthe brick will not pass");
        in.close();
    }
}
