package br.com.hanoi.recursivo;

import java.util.Stack;
import java.util.Scanner;

public class TorreDeHanoi {

	public static void main(String[] args) {

		
		System.out.println("----Torre de Hanoi----");

		Stack<Integer> original = new Stack<>();
		Stack<Integer> dest = new Stack<>();
		Stack<Integer> aux = new Stack<>();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Com quantos discos voce deseja jogar?");
		int n = scan.nextInt();
		
		for(int i=n; i >= 1; i-- ) {
			original.push(i);
		}
		
		
		System.out.println("Numero de discos da torre original" + original);
		
		torreDeHanoi(original.size(), original, aux, dest);

	}
	
	public static void torreDeHanoi(int n, Stack<Integer> original, Stack<Integer> dest, Stack<Integer> aux) {
		
		if(n > 0) {
			torreDeHanoi( n-1, original, aux, dest);
			dest.push(original.pop());
			System.out.println("------");
			System.out.println("Original: " + original);
			System.out.println("Destino: " + dest);
			System.out.println("Aux: " + aux);
			torreDeHanoi(n-1, aux, dest, original);
		}
		
	}

}
