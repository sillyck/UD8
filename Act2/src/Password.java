
public class Password {
		
		private int longitud;
		private String contraseña;
		
		public Password() {
			this.longitud = 8;
			this.contraseña = generarContraseña(longitud);
		}

		public Password(int longitud, String contraseña) {
			
			this.longitud = longitud;
			this.contraseña = generarContraseña(longitud);
		}
		
	    public String getContraseña() {
			return contraseña;
		}

		public static String generarContraseña(int l) {
			String resultado="", letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
			
			for(int i=0;i<l;i++) {
				resultado += letras.charAt((int) Math.floor(Math.random() * letras.length()));
			}
			
			return resultado;
	    }
}