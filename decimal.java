import java.util.Scanner;

/*Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
decimais.*/ 
 
public class decimal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int funcionario;
		double valorHora, hora, salario;
		
		funcionario = sc.nextInt();
		valorHora = sc.nextDouble();
		hora = sc.nextDouble();
		
		salario = valorHora*hora;
		
		System.out.printf("O valor do sal�rio eh %.2f%n: ", salario );
		System.out.println(" numero do funcion�rio �:"+ funcionario);
		
		sc.close();

	}

}
 
