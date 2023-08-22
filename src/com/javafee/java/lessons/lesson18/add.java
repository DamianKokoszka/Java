package com.javafee.java.lessons.lesson18;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class add {
//    public static int[] addX(int n, int arr[], int x , int z){
//        int i;
//        int newarr[] = new int[n + 2];
//        for(i = 0; i <n;i++)
//            newarr[i] = arr[i];
//
//        newarr[n] = x;
//
//        return  newarr;
//    }
//    public static void main(String [] args){
//        Scanner scanner = new Scanner(System.in);
//        int n = 10;
//        int i;
//        int arr [] = {2, 4, 6, 8, 10, 12};
//
//        System.out.println("Tablice: \n" + Arrays.toString(arr));
//
//        int x =scanner.nextInt();
//
//        arr = addX(n,arr,x);
//
//        System.out.println("\nTablica ma " + x + "dodaje: \n" + Arrays.toString(arr) );
//
//    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 61, 28, 2};
        int[] elementToAdd = {7, 7, 7};
        int[] newArray = new int[arr.length + elementToAdd.length];

        for (int i = 0, elementToAddArrayIndex = 0; i < newArray.length; i++) {
            if (i >= arr.length)
                newArray[i] = elementToAdd[elementToAddArrayIndex];
        }
        for (int i = 0; i < newArray.length; i++)
            System.out.print(newArray[i] +" ");
        System.out.println();
    }

//    int[] arr = {2, 6, 1, 61, 28, 2};
//    int[] elementToAdd = {7, 7, 7};
//    int[] newArray = new int[arr.length + elementToAdd.length];
//
//        for (int i = 0, elementToAddArrayIndex = 0; i < newArray.length; i++) {
//        if (i >= arr.length)
//            newArray[i] = elementToAdd[elementToAddArrayIndex];
//    }
//
//    for (int i = 0; i < newArray.length; i++)
//        System.out.print(newArray[i] + " ");
//    System.out.println();
}
