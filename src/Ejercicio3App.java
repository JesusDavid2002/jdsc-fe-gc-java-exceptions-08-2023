import java.util.Random;

import Exceptions.esImpar;
import Exceptions.esPar;

public class Ejercicio3App {

	public static void main(String[] args) throws esImpar, esPar {
		try {
            Random random = new Random();
            int numeroAlt = random.nextInt();
            System.out.println("Generando número aleatorio ...");
            System.out.println("El número aleatorio generado es: " + numeroAlt);
            
            if (numeroAlt % 2 == 0) {
                throw new esPar();
            } else {
                throw new esImpar();
            }
        } catch (esPar e) {
            System.out.println(e.getMessage());
        } catch (esImpar e) {
            System.out.println(e.getMessage());
        }
	}

}
