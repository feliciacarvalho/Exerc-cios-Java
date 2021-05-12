import java.util.Scanner;

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