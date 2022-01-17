
public class ElectrodomesticoApp {

	public static void main(String[] args) {
		
		Electrodomestico e1 = new Electrodomestico(200.00, 50.00);
		Electrodomestico e2 = new Electrodomestico(150.00, "Blanc", 'A', 70.25);
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
	}

}
