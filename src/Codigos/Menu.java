package Codigos;

import java.util.Iterator;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		String opcion;
		operaciones p = new operaciones();
		Scanner in = new Scanner(System.in);
		for (int x = 0; x >= 0; x++) {

			System.out.println(
		   "seleccione una opcion: \nA Enter Areglo A\nB Enter Arreglo B\nC Display A + B\nD Display A - B\nE Display A * B\nF salir  ");

			opcion = in.nextLine();

			switch (opcion) {

			case "A":
			case "a":
				p.arreglo_A();

				break;
			case "B":
			case "b":

				p.arreglo_B();
				break;
			case "C":
			case "c":

				p.suma();
				break;
			case "D":
			case "d":

				p.resta();

				break;
			case "E":
			case "e":

				p.multiplicacion();
				break;
			case "F":
			case "f":

				System.exit(-1);
			default:
				System.out.println("opcion incorrecta ");
				break;
			}

		}

	}
}
