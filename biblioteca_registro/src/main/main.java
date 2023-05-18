package main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int opc;
	
		do {
			System.out.println("Bienvenido al sistema!");
			System.out.println("1.Prestar Libro a Domicilio.");
			System.out.println("2.Devolver.");
			System.out.println("3.Salir");
			System.out.println("Ingrese la opcion:");
			opc=scan.nextInt();
		switch(opc) {
		case 1:
		System.out.print("Ingrese la cantidad de libros a prestar que desea prestar: ");
        int n = scan.nextInt();
        scan.nextLine();

        Libro[] libros = new Libro[n];

        for (int i = 0; i <n; i++) {
            System.out.println("Ingrese los datos del libro " + (i + 1) + ":");
            System.out.print("Titulo: ");
            String nombre = scan.nextLine();
            System.out.print("Autor: ");
            String autor = scan.nextLine();
            System.out.print("Codigo del libro: ");
            String editorial = scan.nextLine();
            System.out.print("Año: ");
            int anio = scan.nextInt();
            scan.nextLine();

            libros[i] = new Libro(nombre, autor, editorial, anio);
        }


        System.out.println(" Libro(s)  para llevar a domicilio:");
        System.out.println("--------------------------------------------------------");
        System.out.println("|   Titulo   |    Autor    |  Codigo del libro  |    Año    |");
        System.out.println("--------------------------------------------------------");

        for (Libro libro : libros) {
            System.out.printf("| %-10s | %-15s | %-15s | %-10d |\n", libro.getName(), libro.getAutor(),
                    libro.getEditorial(), libro.getYear());
        }
        System.out.println("Proceso de prestacion, exitoso!");

        System.out.println("--------------------------------------------------------");
        break;
		case 2:
			System.out.print("Ingrese la cantidad de libros a devolver: ");
	        int cant = scan.nextInt();
	        scan.nextLine();

	        Libro[] libres = new Libro[cant];

	        for (int i = 0; i <cant; i++) {
	            System.out.println("Ingrese los datos del libro " + (i + 1) + ":");
	            System.out.print("Titulo: ");
	            String nombre = scan.nextLine();
	            System.out.print("Autor: ");
	            String autor = scan.nextLine();
	            System.out.print("Codigo del libro: ");
	            String editorial = scan.nextLine();
	            System.out.print("Año: ");
	            int anio = scan.nextInt();
	            scan.nextLine();

	            libres[i] = new Libro(nombre, autor, editorial, anio);
	        }


	        System.out.println("Libro(s) a devolver:");
	        System.out.println("--------------------------------------------------------");
	        System.out.println("|   Titulo   |    Autor    |  Codigo del libro  |    Año    |");
	        System.out.println("--------------------------------------------------------");

	        for (Libro libro : libres) {
	            System.out.printf("| %-10s | %-10s | %-10s | %-10d |\n", libro.getName(), libro.getAutor(),
	                    libro.getEditorial(), libro.getYear());
	        }
	        System.out.println("Devolucion Exitosa!");
	        System.out.println("--------------------------------------------------------");
			break;
		case 3:
			System.out.println("Saliendo del programa!");
			scan.close();
			break;
		default:
			System.out.println("Opcion invalida");
			break;
		}
		}while(opc!=3);
  scan.close();

	}

}
