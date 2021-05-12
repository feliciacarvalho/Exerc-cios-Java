import java.util.Scanner;
/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos. */

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Double a, b, soma; 
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		soma= a+b;
		
		System.out.println(soma);
		
		sc.close();

	}

}
