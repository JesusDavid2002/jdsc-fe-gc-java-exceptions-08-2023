import java.util.Scanner;

import Exceptions.divisionPorCeroException;

public class Ejercicio4App {

	public static void main(String[] args) throws divisionPorCeroException {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
	
		System.out.println("Introduce la operación (suma, resta, multiplicación, división, potencia, raiz, raiz cubica): ");
		String op = scn.next();
		double num1 = 0;
		double num2 = 0;
		double result = 0;
		
		try {
			switch(op) {
			case "suma":
					System.out.println("Introduce el primer número");
					num1 = scn.nextDouble();
					System.out.println("Introduce el segundo número");
					num2 = scn.nextDouble();
					result = num1 + num2;
					System.out.println("El resultado es: " + result);
					break;
			case "resta":
					System.out.println("Introduce el primer número");
					num1 = scn.nextDouble();
					System.out.println("Introduce el segundo número");
					num2 = scn.nextDouble();
					result = num1 - num2;
					System.out.println("El resultado es: " + result);
					break;
			case "multiplicación":
					System.out.println("Introduce el primer número");
					num1 = scn.nextDouble();
					System.out.println("Introduce el segundo número");
					num2 = scn.nextDouble();
					result = num1 * num2;
					System.out.println("El resultado es: " + result);
					break;
			case "división":
					if(num2 == 0) {
						throw new divisionPorCeroException("No se puede dividir entre 0");
					}
					System.out.println("Introduce el primer número");
					num1 = scn.nextDouble();
					System.out.println("Introduce el segundo número");
					num2 = scn.nextDouble();
					result = num1 / num2;
					System.out.println("El resultado es: " + result);
					break;
			case "potencia":
				System.out.println("Introduce el primer número");
				num1 = scn.nextDouble();
				System.out.println("Introduce el elevado");
				num2 = scn.nextDouble();
				result = Math.pow(num1, num2);
				System.out.println("El resultado es: " + result);
				break;
			case "raiz":
				System.out.println("Introduce el número");
				num1 = scn.nextDouble();
				result = Math.sqrt(num1);
				System.out.println("El resultado es: " + result);
				break;
			case "raiz cubica":
				System.out.println("Introduce el número");
				num1 = scn.nextDouble();
				result = Math.cbrt(num1);
				System.out.println("El resultado es: " + result);
				break;
			}
			
			if(!op.equals("suma") && !op.equals("resta") &&!op.equals("multiplicación") && !op.equals("división") &&
			   !op.equals("potencia") && !op.equals("raiz")  && !op.equals("raiz cubica") ) {
				throw new IllegalArgumentException ("Operación desconocida: " + op);
			}
			
			if (op.equals("raiz") && num1 < 0) {
			    throw new IllegalArgumentException("No se puede calcular la raíz de un número negativo.");
			}
			
			if (op.equals("raiz cubica") && num1 < 0) {
			    throw new IllegalArgumentException("No se puede calcular la raíz cúbica de un número negativo.");
			}
			
			if (op.equals("potencia") && num1 < 0 && num2 < 0) {
			    throw new IllegalArgumentException("No se puede calcular potencias con base y exponente negativos.");
			}
			
		} catch(NumberFormatException e) {
			System.out.println("No es un número valido.");
		} finally {
			scn.close();
		}
		
	}

}
