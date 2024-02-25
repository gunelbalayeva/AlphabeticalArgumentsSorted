package com.example;

import java.util.Scanner;

import static com.example.Nethods.print;
import static com.example.Nethods.sorted;

public class AlphabeticalArgumentsSort {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a word: ");
            String inputUser = sc.nextLine();
            String[] a = inputUser.split("");
            sorted(a);
            print(a);
        }
    }


}

