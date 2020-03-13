package co.edu.unac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el nombre, el codigo y la materia del estudiante");
		Estudiante est = new Estudiante(scan.nextLine(), scan.nextLine(), scan.nextLine());
		System.out.println("Ingrese la nota");
		try {
			Materia mat = new Materia(est, scan.nextDouble());
		} catch (ValueException ex) {
			System.out.println("");
			System.out.println(ex.getMessage());
		} finally {
			System.out.print("Fin del Registro");
		}
	}

}
