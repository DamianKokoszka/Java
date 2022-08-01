package com.javafee.java.lessons.lesson1;

public class Main {
	static String napis = "xdfgs";

	static void reverse(int index) {
		System.out.println(napis.charAt(index));
		if (index > 0)
			reverse(index - 1);
	}

	public static void main(String[] args) {
		reverse(napis.length() - 1);

		int liczba; // doklaracja zmiennej typu int
		liczba = 2; // definicja
		int liczba1 = 2; // deklaracja&definicja
		char znak = 'a';
		boolean czyAktywny = false; // definicja wartosci typu boolean - false
		String dom = "duzy dom";

		// ------------ Typy danych ------------
		// Proste (prymitywy)
		// int double char float short long boolean byte

		// Z�o�one
		// Integer Double Character... String char[] Dog[] Dog Cat...

		// operatory przypisania
		// =,+=,-=,/=,%,*=,++,--

		// operatory arytmentyczne
		// +,-,*,/,%

		int aaa = 1, bbb = 2, ccc;
		System.out.println("before: a = " + aaa + " b = " + bbb);
		ccc = aaa + bbb;
		System.out.println("after: a = " + aaa + " b = " + bbb);

		System.out.println("before a = " + aaa + " c = " + ccc);
		ccc += aaa;
		System.out.println("after a = " + aaa + " c = " + ccc);

		int[] myArr2;
		int[] myArr = new int[3]; // definicja
		int[] myArr1 = { 1, 3, 51, 1 }; // definicja przy u�yciu listy inicjalizacyjnej
		myArr[1] = 4;
		myArr[0] = 1;
		myArr[2] = 9;
		System.out.println(myArr[2]);

		// ------------ Instrukcje przeplywu danych------------
		// ------------ Instrukcje typu petle:
		// ------------ Petla for
		// for(<wartosci_poczatkowe> ; <warunek_konca> ; <kroki_inkrementacyjne>) {
		// }
		// for(int i = 0, j = 1, z = 5; i < 10; i++, j--, z += 5) {
		// }
		for (int i = 0; i < myArr.length; i++) {
			System.out.println(myArr[i]);
		}

		// 5 4 3 2 1
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}

		int z = 5;
		while (z >= 1) {
			System.out.println(z);
			z--;
		}

		// 2 4 6 8
		for (int i = 2; i <= 8; i += 2) {
			System.out.println(i);
		}

		// 22 18 14 10 6 2
		for (int i = 22; i >= 2; i -= 4) {
			System.out.println(i);
		}

		// 10 7 5 2 1 0
		for (int i = 10; i >= 0; i--) {
			if ((i % 4 != 0 && i % 3 != 0) || i == 0)
				System.out.println(i);
		}

		// ------------ Petla while
		// 0 ... 10
		int j = 0;
		while (j <= 10) {
			System.out.println(j);
			j++;
		}

		// ------------ Petla do while

		// ------------ Petla foreach

		// ------------ Instrukcje typu instrukcje warunkowe:
		// ------------ if/else if/else
		/*
		 * if(warunek_logiczny) { // jezeli...
		 * 
		 * } else if(warunek_logiczny) { //ponadto jezeli...
		 * 
		 * } else if(warunek_logiczny) { //ponadto jezeli...
		 * 
		 * } else { //i dla pozostalych przypadkow...
		 * 
		 * }
		 */
		int a = 5;
		if (a == 15)
			System.out.println("a == 15");
		else if (a % 2 == 0)
			System.out.println("a podzielne przez 2");
		else if (a % 5 == 0)
			System.out.println("a podzielne przez 5");
		else if (a == 5)
			System.out.println("a == 5");
		else
			System.out.println("zaden z warunkow nie byl spelniony");

		int b = 4;
		if ((b * 3) == 12)
			System.out.println("Sprawdz czy 3*4 = 12 ");
		if ((3 * b) == 12)
			System.out.println("Sprawdz czy 4*3 = 12");

		// ------------ switch

		// 10 8 6 4 2 0
		int l = 10;
		while (l >= 0) {
			System.out.print(l + " ");
			l -= 2;
		}

		System.out.println("\n---1");

		l = 10;
		do {
			System.out.print(l + " ");
			l -= 2;
		} while (l >= 0);

		System.out.println("\n---2");

		l = -1;
		while (l >= 0) {
			System.out.print(l + " ");
			l -= 2;
		} // ?

		System.out.println("\n---3");

		l = -1;
		do {
			System.out.print(l + " ");
			l -= 2;
		} while (l >= 0);// ?

		System.out.println("\n---4");

		for (int p = 10; p >= 0; p -= 2) {
			if (p <= 5)
				break;
			System.out.print(p + " ");
		}

		System.out.println("\n---5");

		for (int p = 10; p >= 0; p -= 2) {
			if (p == 4)
				continue;
			System.out.print(p + " ");
		}

		System.out.println("\n---6");

		// wypisz liczby z zakresu <0, 7) and (14, 17>
		for (int s = 0; s <= 17; s++) {
			if (s >= 7 && s <= 14)
				continue;
			System.out.print(s + " ");
		}

		System.out.println("\n---7");

		// 2 10 4 20 6 30 8 40
		for (int k = 2, y = 10; k <= 8; k += 2, y += 10)
			System.out.print(k + " " + y + " ");

		System.out.println("\n---8");

		for (int k = 2; k <= 8; k += 2)
			System.out.print(k + " ");
		for (int y = 10; y <= 40; y += 10)
			System.out.print(y + " ");

		System.out.println("\n---8");

		Samochod audi = new Samochod("Audi", "a6", 2022);
		audi.jedz(50);

		System.out.println("\n---9");

		// 1 3 5
		// 2 6 10
		// 3 9 15
		// 4 12 20
		for (int aa = 1, bb = 3, cc = 5; bb <= 12; aa++, bb += 3, cc += 5) {
			System.out.print(aa + " " + bb + " " + cc + " ");
		}

		System.out.println("\n---10");

		// 16 8 4 2 1
		for (int ddd = 16; ddd >= 1; ddd /= 2) {
			System.out.print(ddd + " ");
		}

		System.out.println("\n---11");

		for (int i = 0; i < 4; i++) {
			for (int jj = 0; jj < 4; jj++)
				System.out.print("(" + i + ", " + jj + ") ");
			System.out.println(); // enter dla kolejnych wierszy
		}

		// 1 2 3
		// 2 4 6
		// 3 6 9
		for (int i = 1; i <= 10; i++) {
			for (int jj = 1; jj <= 10; jj++) {
				System.out.print(i * jj + "\t");
			}
			System.out.println();
		}

		System.out.println("\n---12");
		for (int i = 1; i <= 10; i++) {
			for (int jj = 1; jj <= 10; jj++) {
				if ((i * jj) % 2 != 0)
					System.out.print((i * jj) + "\t");
				else
					System.out.print("\t");
			}
			System.out.println();
		}

		System.out.println("\n---13");

		int[] myArr5 = new int[4];
		myArr5[0] = 678;
		for (int m = 0; m <= 3; m++)
			System.out.println("Tablica" + myArr5[m]);

		System.out.println("\n---14");

		// 3 5 6 10 9 15 12 20
		for (int n = 3, oo = 5; n <= 12; n += 3, oo += 5)
			System.out.print(n + " " + oo + " ");
		{
		}

		System.out.println("\n---15");

		/*
		 * 1 0 0 0 0 1 0 0 0 0 1 0 0 0 0 1
		 */
		for (int c = 0; c < 4; c++) {
			for (int q = 0; q < 4; q++) {
				if (c == q)
					System.out.print((1) + "\t");
				else
					System.out.print((0) + "\t");
			}
			System.out.println();
		}

		System.out.println("\n---16");
		/*
		 * 0 0 0 0 1 0 0 1 1 0 0 1 0 0 0 0
		 */
		for (int w = 0; w < 4; w++) {
			for (int e = 0; e < 4; e++) {
				if ((w > 0 && w < 3) && (e == 0 || e == 3))
					System.out.print((1) + "\t");
				else
					System.out.print((0) + "\t");
			}
			System.out.println();
		}
		System.out.println("\n---17");
		int[] myArr3 = new int[5];
		myArr3[0] = 1;
		myArr3[1] = 2;
		myArr3[2] = 3;
		myArr3[3] = 4;
		myArr3[4] = 5;
		for (int zzz = 4; zzz >= 0; zzz--) {
			System.out.print(myArr3[zzz]);
		}

		System.out.println("\n---18");
		for (int xx = 1; xx <= 5; xx += 2) {
			System.out.print(xx);
		}

		System.out.println("\n---19");
		for (int cccc = 0; cccc <= 4; cccc++) {
			myArr3[cccc] = 1;
		}

		System.out.println("\n---20");
		for (int bb = 0; bb <= 4; bb++) {
			System.out.print(myArr3[bb]);
		}
		System.out.println("\n---21");
		int n = 5;
		// 1 1 1
		// 2 2 2
		// 3 3 3
		for (int nn = 1; nn < 4; nn++) {
			for (int p = 1; p < 4; p++) {
				if (p == nn)
					System.out.print((p));
				else
					System.out.print((nn));
			}
			System.out.println();
		}
		System.out.println("\n---22");
		// 1 0 0
		// 1 1 0
		// 1 1 1
		for (int mm = 1; mm < 4; mm++) {
			for (int v = 1; v < 4; v++) {
				if (mm < v)
					System.out.print(0);
				else
					System.out.print((1));
			}
			System.out.println();
		}

		// P�tle - powt�rka
		// P�tla for
		for (int o = 2; o < 10; o++) {
			System.out.print(o);
		}
		// P�tla while
		int o = 2;
		while(o <10) {
			System.out.print(o);
			o++;
		}
		// P�tla do while
		int oo = 2;
		do {
			System.out.print(oo);
			oo++;
		}while(o <10);
		
		int[] arrOne = {3, 6, 12, 5}; // lista inicjalizacyjna
		int[] arrTwo = new int[4];
		arrTwo[0] = 44;
		arrTwo[1] = 80;
		System.out.println(arrOne[2]);
		
		// foreach
		// wypisywanie przy pomocy foreach (1 spos�b)
		for(int i : arrOne)
			System.out.println(i);

		// wypisywanie przy pomocy for (2 spos�b)
		for(int i = 0; i < arrOne.length; i++)
			System.out.println(arrOne[i]);
		
		// Instrukcje warunkowe
		// if/else if/else
		int bb = 2;
		if(bb == 6)
		System.out.print( bb == 6);
		else if (b % 2 == 3)
		System.out.print("b podzielone przez 2");
		else {
		}
		
		// switch
		int weekDay = 10;
		switch (weekDay) {
		case 1: 
			System.out.println("Poniedzia�ek");
			break;
		case 2:
			System.out.println("Wtorek");
			break;
		case 3: 
			System.out.println("�roda");
			break;
		case 4:
			System.out.println("Czwartek");
			break;
		default:
			System.out.println("Nieznany dzie�");
		}
	}
}