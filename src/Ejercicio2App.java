import Exceptions.exceptionPersonalizada;

public class Ejercicio2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Mensaje mostardo por pantalla");
			throw new exceptionPersonalizada();
			
		}catch (exceptionPersonalizada ex){
			System.out.println(ex.getMessage());
		}
			System.out.println("Programa terminado");
	}

}
