
public class Password {
	private int longitud = 8;
	private String contraseña;
	
	public Password(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarPassword(longitud);
	}
	
	public void esFuerte() {
		boolean esFuerte = cumpleParametros(this.contraseña);
		
		if(esFuerte) { 
			System.out.println(true);
		}	else {
			System.out.println(false);
		}
	}
	
	private boolean cumpleParametros(String contra) {

		if(contra.length() < 8) {
			return false;
		}
		
		int mayus = 0;
		int minums = 0;
		int nums = 0;
		
		for(char c: contra.toCharArray()) {
			if(Character.isUpperCase(c)) {
				mayus ++;
			} else if(Character.isLowerCase(c)) {
				minums ++;
			} else if (Character.isDigit(c)) {
				nums ++;
			}
		}
		
		if(mayus > 2 && minums > 1 && nums > 5) {
			return true;
		} else {
			return false;
		}
		
	}

	public String generarPassword(int longitud) {
		String datosContra = "0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz";
		String contra = "";
		
		for(int i = 0; i < longitud; i++) {
			contra += (datosContra.charAt((int)(Math.random() * datosContra.length())));
		}
		
		return contra;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	@Override
	public String toString() {
		return "Contraseña= " + contraseña ;
	}
	
	
	
}
