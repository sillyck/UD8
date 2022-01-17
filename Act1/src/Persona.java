
public class Persona {

	private final char SEXO='H';
	
	private String nombre;
	private int edad;
	private String dni;
	private char sexo = SEXO;
	private double peso;
	private double altura;
	
	
	public Persona(String dni) {
		
		this.nombre = "";
		this.edad = 0;
		this.dni = dni;
		this.sexo = SEXO;
		this.peso = 0;
		this.altura = 0;
	}


	public Persona(String nombre, int edad, String dni, char sexo) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = SEXO;
		this.peso = 0;
		this.altura = 0;
	}


	public Persona(String nombre, int edad, char sexo, String dni, double peso, double altura) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = SEXO;
		this.peso = peso;
		this.altura = altura;
	}


	@Override
	public String toString() {
		return "Persona [SEXO=" + SEXO + ", nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo
				+ ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	
}
