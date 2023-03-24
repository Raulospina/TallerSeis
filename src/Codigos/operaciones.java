package Codigos;

import java.util.Scanner;

public class operaciones {
	Scanner in = new Scanner(System.in);
	int arregloA[][] = new int[2][2];
	int arregloB[][] = new int[2][2];
	int suma[][] = new int[2][2];
	int resta[][] = new int[2][2];
	int multiplicacion[][] = new int[2][2];

	public void arreglo_A() {
		System.out.println("ingrese los valores del arreglo A ");
		for (int x = 0; x < arregloA.length; x++) {
			for (int y = 0; y < arregloA.length; y++) {
				arregloA[x][y] = in.nextInt();
			}
		}
		for (int x = 0; x < arregloA.length; x++) {

			for (int y = 0; y < arregloA.length; y++) {
				System.out.print("  |  ");
				System.out.print(arregloA[x][y]);
				System.out.print("  |  ");

			}
			System.out.println("\n");
		}

	}

	public void arreglo_B() {
		System.out.println("ingrese los valores del arreglo B ");
		for (int x = 0; x < arregloB.length; x++) {
			for (int y = 0; y < arregloB.length; y++) {
				arregloB[x][y] = in.nextInt();
			}
		}

		for (int x = 0; x < arregloB.length; x++) {

			for (int y = 0; y < arregloB.length; y++) {
				System.out.print("  |  ");
				System.out.print(arregloB[x][y]);
				System.out.print("  |  ");

			}
			System.out.print("\n");
		}
	}

	public void suma() {

		for (int x = 0; x < arregloA.length; x++) {
			for (int y = 0; y < arregloA.length; y++) {

				suma[x][y] = arregloA[x][y] + arregloB[x][y];

			}

		}
		for (int x = 0; x < suma.length; x++) {

			for (int y = 0; y < suma.length; y++) {
				System.out.print("  |  ");
				System.out.print(suma[x][y]);
				System.out.print("  |  ");

			}
			System.out.print("\n");
		}
	}

	public void resta() {
		for (int x = 0; x < arregloA.length; x++) {
			for (int y = 0; y < arregloA.length; y++) {

				resta[x][y] = arregloA[x][y] - arregloB[x][y];

			}

		}
		for (int x = 0; x < resta.length; x++) {

			for (int y = 0; y < resta.length; y++) {
				System.out.print("  |  ");
				System.out.print(resta[x][y]);
				System.out.print("  |  ");

			}
			System.out.print("\n");
		}
	}

	public void multiplicacion() {

		multiplicacion[0][0] = (arregloA[0][0] * arregloB[0][0]) + (arregloA[0][1] * arregloB[1][0]);
		multiplicacion[0][1] = (arregloA[0][0] * arregloB[0][1]) + (arregloA[0][1] * arregloB[1][1]);
		multiplicacion[1][0] = (arregloA[1][0] * arregloB[0][0]) + (arregloA[1][1] * arregloB[1][0]);
		multiplicacion[1][1] = (arregloA[1][0] * arregloB[0][1]) + (arregloA[1][1] * arregloB[1][1]);

		System.out.println("El resultado es ");
		for (int x = 0; x < 2; x++) {
			for (int y = 0; y < 2; y++) {

				System.out.print("  |  ");
				System.out.print(multiplicacion[x][y]);
				System.out.print("  |  ");

			}
			System.out.print("\n");
		}

	}

}
