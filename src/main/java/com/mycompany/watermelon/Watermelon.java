package com.mycompany.watermelon;

import java.util.Scanner;

public class Watermelon {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte w = scan.nextByte();
        if (w % 2 != 0 || w==2) {
            System.out.println("NO");
        } else {
            System.out.println("YES");

        }
    }
}
