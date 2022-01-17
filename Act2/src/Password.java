
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