import java.util.Scanner;

public class ProyectoPrueba {

	public static void main(String[] args) {
		
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("El numero " + numero + " es par");
		} else {
			System.out.println("El numero " + numero + " es impar");
		}
	}
}
