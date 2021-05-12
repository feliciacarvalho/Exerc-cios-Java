import java.util.Scanner;
/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159  */

public class raio
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		double pi, raio,raioQ, area;
		pi = 3.14159;
		raio = sc.nextDouble();
		raioQ = Math.pow(raio, 2);
		area = pi*raioQ;
		
		System.out.println(area);
		
		
		
		
		
		
		sc.close();
		
		
		
		
	}
		
	
}
