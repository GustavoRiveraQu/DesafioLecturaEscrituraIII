package cl.grivera;

import java.util.ArrayList;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Perro");
		lista.add("Gato");
		lista.add("Juan");
		lista.add("Daniel");
		lista.add("Juan");
		lista.add("Gato");
		lista.add("Perro");
		lista.add("Camila");
		lista.add("Daniel");
		lista.add("Camila");
		System.out.print(lista);
		
		System.out.println("Ingrese la palabra que desea contar");
		Scanner ingreso = new Scanner(System.in);
		String texto= ingreso.next();
		for (int i=0 ; i< lista.size(); i++){
			if ( lista.get(i).equals(texto)) {
				System.out.print("Miau");
			}
		}

	}

}
