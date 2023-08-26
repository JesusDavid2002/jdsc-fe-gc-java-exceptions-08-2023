import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		double numeroRandom = Math.floor(Math.random() * (500 - 1) + 1);
		int numero = 0;
		int acumulador = 0;
		
		try {
			while (numeroRandom != numero) {
			System.out.println("Intenta adivinar el numero entre 1 y 500");
			numero = scn.nextInt();
		
			if(numero > numeroRandom) {
				System.out.println("El número que has puesto es mayor");
				acumulador ++;
			} else if (numero < numeroRandom){
				System.out.println("El número que has puesto es menor");
				acumulador ++;
			} else {
				break;
			}
		} 
			System.out.println("Enhorabuena el número es " + numeroRandom + ", has realizado " + acumulador + " intentos.");
		
		}catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		
			
	}

}
