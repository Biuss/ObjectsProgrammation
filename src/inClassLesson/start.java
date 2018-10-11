package inClassLesson;

public class start {

	public static void println(Object string) {
		System.out.println(string);
	}

	public static void printf(Object string) {
		System.out.print(string);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Archive a = new Archive(10);
		Persona p;
		
		p  = new Persona("Roberto","Spotti",53,'m');
		a.addPersona(p);
		 
		 
		 p  = new Persona("Paolino","Pallino",97,'m');
		 a.addPersona(p);
		 
		 p = a.cerca("Pallino");
		 
		 System.out.println(p);
		 System.out.println(p.nome);
		 System.out.println(p.cognome);
		 System.out.println(p.eta);
		 System.out.println(p.sex);
		 
		 
	}

}
