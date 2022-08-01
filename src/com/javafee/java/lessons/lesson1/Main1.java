package com.javafee.java.lessons.lesson1;

import java.util.Random;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
//		System.out.println("Task 1 ----------------------------------------------------------------------");
//		// for input = 6
//		// 1 3 5 7 9 11
//		
//		// for input 4
//		// 1 3 5 7
//		Scanner scanner = new Scanner(System.in);
//		int input = scanner.nextInt();
//		for(int i = 0, no = 1; i < input; i++, no += 2) 
//			System.out.print(no + " ");
//		System.out.println();
//
//		System.out.println("Example 1 -------------------------------------------------------------------");
//		// <1, 10> even number
//		for(int i = 2; i <= 10; i += 2)
//			System.out.print(i + " ");
//		System.out.println();
//		
//		System.out.println("Task 2 ----------------------------------------------------------------------");
//		// for input = 4
//		// 4 3 2 1 0 -1 -2 -3 -4
//		input = scanner.nextInt();
//		for(int i = input, no = input; i >= -input;  i--, no-- )
//			System.out.print(no + " ");
//		System.out.println();
//		
//		
//		// for input = 2
//		// 2 1 0 -1 -2
//		
//		System.out.println("Task 3 ----------------------------------------------------------------------");
//		// for input = 3
//		// 3 6 9
//		
//		// for input = 2
//		// 3 6
//		input = scanner.nextInt();
//		for(int i = 0, no = 3; i < input; i++, no += 3)
//			System.out.print(no + " ");
//		System.out.println();
//		
//		System.out.println("Task 4 ----------------------------------------------------------------------");
//		// for input = 10
//		// 10 100 1000 10000 100000 1000000
//		
//		// for input = 1000
//		// 1000 10000 100000 1000000
//		
//		// for input = 100000
//		// 100000 1000000
//		input = scanner.nextInt();
//		for(int i = input; i <= 1000000; i*= 10)
//			System.out.print(i + " ");
//		System.out.println();

//		System.out.println("Task 5 ----------------------------------------------------------------------");
//		// for input = 4
//		// 4 3 1
//		// 4 3 1
//		// 4 3 1
//		// 4 3 1
//
//		// for input = 8
//		// 8 7 6 5 4 3 1
//		// 8 7 6 5 4 3 1
//		// 8 7 6 5 4 3 1
//		// 8 7 6 5 4 3 1
//		// 8 7 6 5 4 3 1
//		// 8 7 6 5 4 3 1
//		// 8 7 6 5 4 3 1
//		// 8 7 6 5 4 3 1
//		Scanner scanner = new Scanner(System.in);
//		int input = scanner.nextInt();
//		for(int j = 0; j < input; j++) {
//			for(int i = input; i >= 1; i--)
//				if(i != 2)
//					System.out.print(i + " ");
//			System.out.println();
//		}
//		
//		System.out.println("Example 2 -------------------------------------------------------------------");
//		// 1 2 3
//		// 1 2 3
//		// 1 2 3
//		for (int j = 0; j < 3; j++) {
//			for (int i = 1; i <= 3; i++)
//				System.out.print(i + " ");
//			System.out.println();
//		}

//		System.out.println("Task 6 ----------------------------------------------------------------------");
//		// 0 0 0 0 0 0
//		// 0 1 1 1 1 0
//		// 0 1 1 1 1 0
//		// 0 1 1 1 1 0
//		// 0 1 1 1 1 0
//		// 0 0 0 0 0 0
//		for (int rowNumber = 0; rowNumber < 6; rowNumber++) {
//			for (int columnNumber = 0; columnNumber < 6; columnNumber++)
//				if (columnNumber == 0 || columnNumber == 5 || rowNumber == 0 || rowNumber == 5)
//					System.out.print(0 + " ");
//				else
//					System.out.print(1 + " ");
//			System.out.println();
//		}
//
		System.out.println("Example 3.1 -----------------------------------------------------------------");
		for (int rowNumber = 0; rowNumber < 4; rowNumber++) {
			for (int columnNumber = 0; columnNumber < 4; columnNumber++)
				System.out.print("[ r: " + rowNumber + " c: " + columnNumber + "]\t");
			System.out.println();
		}
//
//		System.out.println("Example 3.1 -----------------------------------------------------------------");
		for (int rowNumber = 0; rowNumber < 4; rowNumber++) {
			for (int columnNumber = 0; columnNumber < 4; columnNumber++)
				if (columnNumber == 0 || columnNumber == 3)
					System.out.print("$\t");
				else if (rowNumber == 0 || rowNumber == 3)
					System.out.print("#\t");
				else if (rowNumber == columnNumber)
					System.out.print("*\t");
				else
					System.out.print(".\t");
			System.out.println();
		}

//		for (int rowNumber = 0; rowNumber < 4; rowNumber++) {
//			for (int columnNumber = 0; columnNumber < 4; columnNumber++)
//				if (columnNumber == 0 || columnNumber == 3 || rowNumber == 0 || rowNumber == 3)
//					System.out.print(":)\t");
//				else
//					System.out.print(":D\t");
//			System.out.println();
//		}

		// for input = 5
		// 0 5 10 15 20

		// for input = 5
		// 0 5 10 15 20
		// 0 5 10 15 20
		// 0 5 10 15 20
		// 0 5 10 15 20
		// 0 5 10 15 20

		// for input = 4
		// 4 3 2 1
		// 5 4 3 2
		// 6 5 4 2
		// 7 6 5 4

		// for input 10
		// 1 2 3 2 1 2 3 2 1 2

		// for n = 6
		// 1 2 4 8 16 32 64

		// for n = 4
		// 10 100 1000 10000

		// for n = 4
		// 10 100 1000 10000 1000 100 10

		// for n = 4
		// 1 2 3 4 5
		// 6 5 4 3 2
		// 7 8 9 10 11
		// 16 15 14 13 12

		// dla n = 2 i z = 4
		// 1 1 | 2 2 | 3 3 | 4 4
		// dla n = 4 i z = 2
		// 1 1 1 1 | 2 2 2 2

		// dla n = 4 (even numbers)
		// 2
		// 4 4
		// 6 6 6
		// 8 8 8 8

		// dla n = 4
		// 2
		// 7 7 7 7
		// 4 4
		// 5 4 4
		// 6 6 6
		// 3 3
		// 8 8 8 8
		// 1

		// for n = 4
		// 1 2 3 4 3 2 1 2 3 4 3 2 1
		// for n = 5
		// 1 2 3 4 5 4 3 2 1 2 3 4 5 4 3 2 1

		// Desc: 2/3/4/5/6/7/8/9/10 (+1) and 4/5/7/10/14/19/25/32/40 (+1/2/3/...)
		// 2 4 3 5 4 7 5 10 6 14 7 19 8 25 9 32 10 40

		// Desc: two sequences (pair) - forward sequence and backward sequence, then
		// increment the values
		// perform til 10 value for the forward sequence
		// 2 4 3 5 4 7 5 10 6 14 7 19 8 25 9 32 10 40
		// 40 10 32 9 25 ...
		// 3 5 4 6 5 8 6 11 7 15 8 20 9 26 10 33 11 41
		// 41 11 33 10 26 ...
		// ...
		// ...
		// 10 ...
		// ...

//		float waga = 75.8F;
//		long zmienna = 12l;
//		int temperature = 36;
//		switch (temperature) {
//		case 35:
//			System.out.println("Jestes oslabiony");
//			break;
//		case 36:
//			System.out.print("Wszystko w normie");
//			break;
//		default:
//			System.out.println("Nie mog� oceni� takiej temperatury");
//		}
//
//		// for input 4
//		// 1 0 0 0
//		// 0 1 0 0
//		// 0 0 1 0
//		// 0 0 0 1
//		Scanner scanner = new Scanner(System.in);
//		int input = scanner.nextInt();
//		for (int i = 0; i < input; i++) {
//			for (int j = 0; j < input; j++)
//				System.out.print(i == j ? "1\t" : "0\t");
//			System.out.println();
//		}
//
//		// for input 4
//		// 1 1 1 1
//		// 0 0 0 0
//		// 0 0 0 0
//		// 1 1 1 1
//		input = scanner.nextInt();
//		for (int a = 0; a < 4; a++) {
//			for (int b = 0; b < 4; b++)
//				if (a == 0 || a == 3)
//					System.out.print("1");
//				else
//					System.out.print("0");
//			System.out.println();
//		}
//
//		// for input 4
//		// 1 0 0 1
//		// 1 0 0 1
//		// 1 0 0 1
//		// 1 0 0 1
//		input = scanner.nextInt();
//		for (int i = 0; i < input; i++) {
//			for (int j = 0; j < input; j++)
//				if (j == 0 || j == input - 1)
//					System.out.print("1");
//				else
//					System.out.print("0");
//			System.out.println();
//		}
//
//		// for input 4
//		// 0 0 0 1
//		// 0 0 1 0
//		// 0 1 0 0
//		// 1 0 0 0
//		input = scanner.nextInt();
//		for (int i = 3; i >= 0; i--) {
//			for (int j = 0; j < 4; j++)
//				System.out.print(j == i ? "1\t" : "0\t");
//			System.out.println();
//		}
//
//		// for input 4
//		// 1 1 1 1
//		// 1 0 0 1
//		// 1 0 0 1
//		// 1 1 1 1
//		input = scanner.nextInt();
//		for (int i = 0; i < input; i++) {
//			for (int j = 0; j < input; j++)
//				System.out.print(i == 0 || i == input - 1 || j == 0 || j == input - 1 ? "1" : "0");
//			System.out.println();
//		}
//
//		System.out.println("21.07.2022 ======================================================================");
//		// for input 6
//		// 1 2 3 2 1
//		for (int i = 0, no = 1; i < 5; i++) {
//			System.out.print(no + " ");
//			if (i < 2)
//				no++;
//			else
//				no--;
//		}
//		System.out.println();
//
//		// for input 6
//		// 5 6 5 6 5 6
//		// 5 6 5 6 5 6
//		// 5 6 5 6 5 6
//		// 5 6 5 6 5 6
//		// 5 6 5 6 5 6
//		// 5 6 5 6 5 6
//		input = scanner.nextInt();
//		for (int j = 0; j < 6; j++) {
//			for (int i = 0, no = 5; i < 6; i++) {
//				System.out.print(no + " ");
//				if (i % 2 == 0)
//					no++;
//				else
//					no--;
//			}
//			System.out.println();
//		}
//
//		// 1 1 1 1 1
//		// 2 2 2 2 2
//		// 3 3 3 3 3
//		// 4 4 4 4 4
//		// 5 5 5 5 5
//		input = scanner.nextInt();
//		for (int j = 5; j >= 1; j--) {
//			for (int i = 5; i >= 1; i--) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//
//		// 1 0 0 0
//		// 0 1 0 0
//		// 0 0 1 0
//		// 0 0 0 1
//		input = scanner.nextInt();
//		for (int j = 0; j < input; j++) {
//			for (int i = 0; i < input; i++) {
//				if (i == j)
//					System.out.print(1 + " ");
//				else
//					System.out.print(0 + " ");
//			}
//			System.out.println();
//		}

		/*
		 * Guess the number! > 34 34 is lower then the random number, try again! > 56 56
		 * is greater then the random number, try again! > 50 50 is greater then the
		 * random number, try again! > 48 Great! 48 is the correct number! It takes u 4
		 * rounds to guess!
		 */
//		Scanner scanner = new Scanner(System.in);
//		int number = new Random().nextInt(101); // [0, 100]
//		System.out.println("Zgadnij co to za liczba z przedzialu 0-100.");
//
//		int liczbaOdUzytkownika;
//		int iloscProb = 0;
//		do {
//			iloscProb++;
//			System.out.print("Podaj liczbe: ");
//			liczbaOdUzytkownika = scanner.nextInt();
//
//			if (liczbaOdUzytkownika < number) {
//				System.out.println("Podales za mala liczbe ");
//			} else if (liczbaOdUzytkownika > number) {
//				System.out.println("Podales za duza liczbe ");
//			}
//		} while (number != liczbaOdUzytkownika);
//		System.out.print("Gratuluje! Zgadles liczbe w " + iloscProb + " probie");
		// = += ++ ...
		// == != !

//		Scanner scanner = new Scanner(System.in);
//
//		int liczbaOdUzytkownika;
//		int iloscProb = 0;
//		Integer najlepszyWynik = null;
//
//		while (true) {
//			int number = new Random().nextInt(101); // [0, 100]
//			System.out.println("Zgadnij co to za liczba z przedzialu 0-100.");
//			iloscProb = 0;
//
//			do {
//				iloscProb++;
//				System.out.print("Podaj liczbe: ");
//				liczbaOdUzytkownika = scanner.nextInt();
//
//				if (liczbaOdUzytkownika < number) {
//					System.out.println("Podales za mala liczbe ");
//				} else if (liczbaOdUzytkownika > number) {
//					System.out.println("Podales za duza liczbe ");
//				}
//			} while (number != liczbaOdUzytkownika);
//			System.out.print("Gratuluje! Zgadles liczbe w " + iloscProb + " probie ");
//			System.out.println("Chcesz grac dalej? (Y) ");
//
//
//			if (najlepszyWynik == null || (najlepszyWynik != null && iloscProb < najlepszyWynik)) {
//				najlepszyWynik = iloscProb;
//			}
//			System.out.println("Najlepszy wynik: " + najlepszyWynik);
//			
//			String input = scanner.next();
//			if (!input.equals("y"))
//				return;
//		}

		// najlepszy wynik
		// czy chcesz grac dalej?

		// 2 4 6 8
		// 2 4 6 8
		// 2 4 6 8
		// 2 4 6 8
//		int number = 20;
//		for (int a = 0; a < number; a++) {
//			for (int b = 2, j = 0; j < number; b+=2, j++)
//				System.out.print(b + " ");
//			System.out.println();
//		}

		// 10 5 8 10 6 15 4 20 2 25 0 30
		for (int a = 10, b = 5; a >= 0; a -= 2, b += 5) {
			System.out.print(a + " " + b + " ");
		}
		System.out.println();
		System.out.println("------------");

		// 10 5 8 10 6 15 4 20 2 25 0 30
		// 10 5 8 10 6 15 4 20 2 25 0 30
		// 10 5 8 10 6 15 4 20 2 25 0 30
		// 10 5 8 10 6 15 4 20 2 25 0 30
		for (int i = 0; i < 5; i++) {
			for (int a = 10, b = 5; a >= 0; a -= 2, b += 5)
				System.out.print(a + " " + b + " ");
			System.out.println();
		}

		// 2 4 8 16 32
		for (int i = 2; i <= 32; i *= 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("------------");

		// 2 4 8 16 -> 2*1 2*2 2*3 2*4
		// 3 9 27 ... -> 3*1 3*2 3*3 3*4
		// 4 16 64 ... -> 4*1 4*2 ...
		// 5 25 150 ...
		for (int i = 0, no = 0; i < 4; i++, no++) {
			for (int a = no, j = 2, b = 3, c = 4, d = 5; j <= 16; j *= 2, b *= 3, c *= 4, d *= 5)
				System.out.print(a + " ");
			System.out.println();
		}
		System.out.println("-----------");

		for (int i = 0, no = 2; i < 4; i++, no++) {
			for (int z = no, j = 0; j < 4; j++, z *= no) {
				System.out.print(z + " ");
			}
			System.out.println();
		}
		System.out.println("-----------");

		// 2 2 2
		// 6 6 6
		// 24 24 24
		// 72 72 72
		int suma = 2;
		int sumaLok = suma;
		for (int i = suma, j = 0; j < 4; j++) {
			for (int z = 0; z < 4; z++) {
				System.out.print(suma + " ");
				sumaLok += suma;
			}
			suma = sumaLok;
			System.out.println();
		}

		// *
		// **
		// ***
		// ****
		// ***
		// **
		// *
//		for(int i = 0; i <7; i++) {
//			for(int j = 4; j <1; j--)
//				if(j <4 -i)
//			System.out.print(" * ");
//			System.out.println();
//		}

		for (int i = 0, no = 1; i < 7; i++) {
			for (int j = 0; j < no; j++)
				System.out.print("*");
			if (i < 3)
				no++;
			else
				no--;
			System.out.println();
		}

		// n = 7
		// *
		// **
		// *
		// **
		// *
		// **
		// *
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		for (int i = 0, no = 1; i < input; i++) {
			for (int j = 0; j < no; j++) {
				System.out.print("*");
			}

			if (i % 2 == 0)
				no++;
			else
				no--;
			System.out.println();
		}
	}
}