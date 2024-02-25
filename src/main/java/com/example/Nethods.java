package com.example;

public class Nethods {
    public static void print(String[] s) {
        if (s != null && s.length > 0) {
            for (String str : s) {
                System.out.print(str);
            }
        }
    }

    public static void sorted(String... arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {// novbeti(j+1) herfden boyukdurse,
                    String temp = arr[j];  // arr[j] nedirse onu temp-e menimset
                    arr[j] = arr[j + 1];  // j-ye menimset ozunden sonraki elementi
                    arr[j + 1] = temp; //  // tempe menimset
                }
            }
        }
    }
}
