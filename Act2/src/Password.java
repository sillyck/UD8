
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
	    	int contra;
	    	String contraS = "", rFinal="";
	    	
	    	for (int i = 0;i<l;i++) {
	    		contra = (int) (Math.random()* (l - 1));
	    		contraS = String.valueOf(contra);
	    		rFinal = rFinal + contraS;
	    	}
	    	
	    	return rFinal; 
	    }
}