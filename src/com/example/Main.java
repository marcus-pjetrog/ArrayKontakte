/*
 * Program for demonstrating array functions
 * 2021-05-28
 * marcus.pjetrog.2020@gmail.com
 */
package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String[]  namen = {"Jovan", "Alex", "Sara", "Peter", "Adrian"};
        int[] nummern = {154212, 57124, 548721, 87575, 657212};

        for (int i = 0; i < namen.length; i++){
            System.out.println(namen[i]);
        }
        System.out.print("Bitte wähle einen Namen aus: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        boolean isInArray = true;
        for (int i = 0; i < namen.length; i++){
            isInArray = name.equals(namen[i]);
            if (isInArray) {
                System.out.println(nummern[i]);
                break;
            }
        }
        if(isInArray == false) System.out.println("\nDer Name ist nicht im Array vorhanden.");

        System.exit(0);

    }



}
