
public class Serie {

	protected String titulo="";
	protected int nTemp=0;
	protected boolean entregado=false;
	protected String genero="";
	protected String creador="";
	
	public Serie() {
		this.nTemp=3;
		this.entregado=false;
		this.titulo="";
		this.genero="";
		this.creador="";
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.genero="";
		this.nTemp=3;
		this.entregado=false;
	}

	public Serie(String titulo, int nTemp, String genero, String creador) {
		this.titulo = titulo;
		this.nTemp = nTemp;
		this.genero = genero;
		this.creador = creador;
		this.entregado=false;
	}

	@Override
	public String toString() {
		return "titulo=" + titulo + ", nTemp=" + nTemp + ", entregado=" + entregado + ", genero=" + genero
				+ ", creador=" + creador;
	}
	
	
}
