
public class Electrodomestico {

	protected double precioBase=0;
	protected colores color;
	protected consumo conElec;
	protected double peso=0;
	
	public Electrodomestico() {
		this.color=colores.blanco;
		this.conElec=consumo.F;
		this.precioBase=100;
		this.peso=0;
	}

	public Electrodomestico(double precioBase, double peso) {
		this.color=colores.blanco;
		this.conElec=consumo.F;
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, colores color, consumo conElec, double peso) {
		this.precioBase = precioBase;
		this.color = colores.blanco;
		this.conElec =consumo.F;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "precioBase=" + precioBase + ", color=" + color + ", conElec=" + conElec + ", peso="
				+ peso;
	}
	
	
}
