package com.javafee.java.lessons.lesson18;

import java.util.Scanner;

/*
Task 1:
W klasie jest 37 uczniów, udowdonij, że co najmniej 4 uczniów urodziło się w jednym miesiacu.
odp: //TODO:
 */
public class Lesson18 {
    public static void main(String[] args) {
        int[] inputArr = {2, 6, 41, 11, 61, 7, 12}; // tablica wejściowa
        Scanner scanner = new Scanner(System.in);
        int indexesToRemove = scanner.nextInt(); // liczba indeksów do usunięcia
        int[] indexesToRemoveArr = new int[indexesToRemove], // tablica przechowująca indeksy do usunięcia o wielkości indexesToRemove
                resultArr = new int[inputArr.length - indexesToRemove]; // tablica wynikowa (bez elementów które mają być usunięte)

        for (int i = 0; i < indexesToRemoveArr.length; i++)
            indexesToRemoveArr[i] = scanner.nextInt();

        boolean isToRemove; // flaga przechowująca informację czy dany element o indekse i'tym jest do usunięcia (pominięcia)
        for (int i = 0, r = 0; i < inputArr.length; i++) { // iteracja po tablicy wejściowej
            isToRemove = false; // na początku zakładamy, że dany element i nie jest indeksem do usunięcia

            // czy indeks i jest indeksem elementu do usunięcia?
            for (int j = 0; j < indexesToRemoveArr.length; j++) {
                if (i == indexesToRemoveArr[j]) {
                    isToRemove = true;
                    break;
                }
            }

            if (!isToRemove) { // jeśli pętla 23-28 zidentyfikuje, że index i znajduje się w tablicy indexesToRemoveArr to ustawiamy flagę na true
                resultArr[r] = inputArr[i]; // wstawienie elementu o indeksie i do tablicy wynikowej, w przeciwnym razie pominięcie elmentu
                r++;
                System.out.println("Tablica " + inputArr[i] );
            }
        }
    }
}