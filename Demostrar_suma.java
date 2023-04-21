package Tema_2;
import java.util.Scanner;

import Libsss.sumaaa;

public class Demostrar_suma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un valor entero positivo para A = ");
		int A = sc.nextInt();
		System.out.println("Ingresa un valor entero positivo para B = ");
		int B = sc.nextInt();
		//System.out.println(A+" + "+B+" = "+(A+B));
		
		//suma sx = new suma();
		//System.out.println(A+" + "+B+" = "+sx.sumar(A, B));
		
		sumaaa scx = new sumaaa();
		System.out.println(A+" + "+B+" = "+scx.sumar2num(A, B));
		
	}

}
