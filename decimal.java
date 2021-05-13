import java.util.Scanner;

/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
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
		
		System.out.printf("O valor do salário eh %.2f%n: ", salario );
		System.out.println(" numero do funcionário é:"+ funcionario);
		
		sc.close();

	}

}
 
