
public class Electrodomestico {

	protected double precioBase=0;
	protected String color="";
	protected char conElec=' ';
	protected double peso=0;
	
	public Electrodomestico() {
		this.color="blanco";
		this.conElec='F';
		this.precioBase=100;
		this.peso=0;
	}

	public Electrodomestico(double precioBase, double peso) {
		this.color="blanco";
		this.conElec='F';
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, String color, char conElec, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.conElec = conElec;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "precioBase=" + precioBase + ", color=" + color + ", conElec=" + conElec + ", peso="
				+ peso;
	}
	
	
}
