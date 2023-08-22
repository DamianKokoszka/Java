package com.javafee.java.lessons.lesson18;

import java.util.Scanner;

public class Lesson19 {
    public static void main(String[] args){
        int[] inputArr = {2,4,6,8,10,12};
        Scanner scanner = new Scanner(System.in);
        int indexesToRemove = scanner.nextInt();
        int[] indexesToRemoveArr = new int[indexesToRemove],
                resultArr = new int[inputArr.length - indexesToRemove];
        for(int i =0; i< indexesToRemoveArr.length; i++)
            indexesToRemoveArr[i] = scanner.nextInt();

        boolean isToRemove;
        for(int i = 0, r =0; i <inputArr.length; i++){
            isToRemove = false;

            for(int j=0; j <indexesToRemoveArr.length; j++){
                if(i == indexesToRemoveArr[j]){
                    isToRemove = true;
                    break;
                }
            }

            if(!isToRemove){
                resultArr[r] = inputArr[i];
                r++;
                System.out.println("Wypisz pozostałe indeksy: " + inputArr[i]);
            }
        }
    }
}
