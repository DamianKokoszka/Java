package com.javafee.java.lessons.lesson18;

import javax.swing.text.Style;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {2, 4, 6, 8, 10, 12};
        int n = arr.length;
        int indexesToAdd = scanner.nextInt();
        int[] indexesToAddArr = new int[indexesToAdd];
        int newArr[] = new int[n + indexesToAdd];
        for (int i = 0; i < indexesToAddArr.length; i++)
            indexesToAddArr[i] = scanner.nextInt();

        for (int i = 0, r = 0; i < newArr.length; i++) {

            for (int j = 0; j < indexesToAddArr.length; j++)

                newArr[r] = arr[i];
                r++;
                System.out.println("Wypisz pozołe indeksy: " + arr[i]);
            }
        }
    }
