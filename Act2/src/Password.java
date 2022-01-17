
public class Password {
		
		private int longitud;
		private String contrase�a;
		
		public Password() {
			this.longitud = 8;
			this.contrase�a = generarContrase�a(longitud);
		}

		public Password(int longitud, String contrase�a) {
			
			this.longitud = longitud;
			this.contrase�a = generarContrase�a(longitud);
		}
		
	    public String getContrase�a() {
			return contrase�a;
		}

		public static String generarContrase�a(int l) {
			String resultado="", letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
			
			for(int i=0;i<l;i++) {
				resultado += letras.charAt((int) Math.floor(Math.random() * letras.length()));
			}
			
			return resultado;
	    }
}