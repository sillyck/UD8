
public class Persona {

	private String nombre;
	private int edad;
	private String dni;
	private genero sexo;
	private double peso;
	private double altura;
	
	
	public Persona(String dni) {
		
		this.nombre = "";
		this.edad = 0;
		this.dni = dni;
		this.sexo = genero.H;
		this.peso = 0;
		this.altura = 0;
	}


	public Persona(String nombre, int edad, String dni, genero sexo) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
	}


	public Persona(String nombre, int edad, genero sexo, String dni, double peso, double altura) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}


	@Override
	public String toString() {
		return "SEXO=" + sexo + ", nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo
				+ ", peso=" + peso + ", altura=" + altura;
	}
	
	
}
