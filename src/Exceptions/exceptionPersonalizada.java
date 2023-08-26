package Exceptions;

public class exceptionPersonalizada extends Exception{
	
	public exceptionPersonalizada() {
		super();
	}
	
	@Override
	public String getMessage() {
		String mensaje = "Excepcion capturada con mensaje: Esto es un objeto Exception";
		
		return mensaje;
	}
	
}
