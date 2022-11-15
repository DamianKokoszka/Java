package com.javafee.java.lessons.lesson13;

public class Main {
    public static void main(String[] args) {
        task1(6);
        task2(new int[]{55, 2, 3, 4, 5, 1, 7, 8, 9, 10});
        task3();
        task4();
        task5(0, 1);
        task6(1, 2);
        task7(2, 4);
        task8(3, 8);
        int[][] arr2D = new int[2][2];
        arr2D[0][0] = 1;
        arr2D[0][1] = 2;
        // ...
        task9(new int[][]{{1, 2, 3}, {4, 5, 6}});
    }

    public static void task1(int len) {
        for (int i = 0; i <= len; i++) {
            for (int j = i; j <= len; j++) {
                System.out.print("");
            }
            for (int m = 1; m <= i; m++) {
                System.out.print(m);
            }
            System.out.println();
        }

    }

    public static void task2(int[] arr) {
        int min, max;
        min = max = arr[0];
        for (int i = 1; i < 10; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("Najmiejsza i najwieksza wartosc: " + min + " " + max);
    }

    public static void task3() {
        System.out.println(checkPostcode("1234AB"));
        System.out.println(checkPostcode("5678MN"));
        System.out.println(checkPostcode("0123AB"));
        System.out.println(checkPostcode("1023AB"));
        System.out.println(checkPostcode("1230AB"));
        System.out.println(checkPostcode("AB1234"));
        System.out.println(checkPostcode("123456"));
        System.out.println(checkPostcode("ABCDEF"));
        System.out.println(checkPostcode("12345A"));
        System.out.println(checkPostcode("A12345"));
        System.out.println(checkPostcode("A12345B"));
        System.out.println(checkPostcode("1ABCDE6"));
        System.out.println(checkPostcode("1ABCD6"));

    }


    public static boolean checkPostcode(String postCode) {
        return postCode.matches("[1-9]{1}[0-9]{3}[a-zA-Z]{2}");
    }

    public static void task4() {
        int base = 4, exponent = 4;
        long result = 1;

        while (exponent != 0) {
            result *= base;
            --exponent;
        }
        System.out.println("Wynik =" + result);
    }

    public static void task5(int base, int exponent) {
        long result = 1;

//        for(; exponent != 0; --exponent){
//            result *= base;
//        }
        for (int i = 0; i < exponent; i++, result *= base) {
        }

        System.out.println(base + " " + exponent + " " + exponent);
    }

    public static void task6(int base, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++, result *= base) {
        }
        System.out.println(base + " " + exponent + " " + exponent);
    }

    public static void task7(int base, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++, result *= base) {
        }
        System.out.println(base + " " + exponent + " " + exponent);
    }

    public static void task8(int base, int exponent) {
        long result = 1;
        Integer number = new Integer(10);
        for (int i = 0; i < exponent; i++, result *= base) {
        }
        System.out.println(base + " " + exponent + " " + number);
    }

    public static void task9(int[][] arr) {
        int a[][] = {{1,3,4}, {6,4,5}};
        int b[][] = {{1,3,7}, {9,4,2}};
        int c[][] = new int[2][3];
        for(int i =0; i <2;i++){
            for(int j =0;j <3;j++){
                c[i][j] =a[i][j] + b[i][j];
                System.out.println(c[i][j] +"");
            }
        }
    }
}