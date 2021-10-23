package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean istrue = false;
        System.out.println("Введіть число n: ");

        double num = Math.pow(sc.nextDouble(), 2);// піднесення до квадрату
        System.out.println("Число n^2 = "+ num);
        String nums = Double.toString(num);
        char ch[] = nums.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if (ch[i] == '3') {
                istrue = true;
            }
        }
        if(istrue){System.out.println("Цифра 3 входить в число");}
        else { System.out.println("Цифра 3 не входить в число");
        }
    }
}