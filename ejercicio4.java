import java.util.*;

public class ejercicio4{

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingrese su edad: ");
		int edad = teclado.nextInt();

		if (edad >= 18) {
			System.out.println("es mayor de edad !! ");
		}else{
			System.out.println("es menor de edad !!");

		}
	}
}