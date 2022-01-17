
public class PersonaApp {

	public static void main(String[] args) {
		
		Persona Constructor1 = new Persona("15328475Q");
		Persona Constructor2 = new Persona("Jordi", 19, "15328475Q", 'H');
		Persona Constructor3 = new Persona("Jordi", 19, 'H', "15328475Q", 60, 1.83);
	
		System.out.println(Constructor1.toString());
		System.out.println(Constructor2.toString());
		System.out.println(Constructor3.toString());
		
	}

}
