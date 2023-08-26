import java.util.Scanner;

public class Ejercicio5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		System.out.println("Introduce la cantidad de contraseñas que deseas: ");
		int longitudArray = scn.nextInt();
		Password[] pswrd = new Password [longitudArray];
		
		System.out.println("Introduce la longitud de las contraseñas: ");
		int longitudContra = scn.nextInt();
		
		for(int i = 0; i < pswrd.length; i++) {
			pswrd[i] = new Password(longitudContra);
			System.out.println(pswrd[i].toString());
			pswrd[i].esFuerte();
		}
	}

}
