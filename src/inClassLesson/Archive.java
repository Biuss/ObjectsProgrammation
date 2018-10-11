package inClassLesson;

public class Archive {

	//variabili
	private int indice = 0;
	private Persona [] listaPersone = new Persona[10];
	
	public Archive (int dimensione) {
		listaPersone = new Persona [dimensione];
	}
	
	public boolean addPersona(Persona p) {
		if (indice < 10) {
	listaPersone[indice++] = p;
		return true;
		}
		else {
			return false;
		}
	}
	public Persona cerca( String cognome ) {
		 for ( Persona p: listaPersone ) {
			 if ( cognome.equals(p.cognome) ){
				 return p;
			 }
		 }
		 return null;
	}
	
}