package inClassLesson;

import java.util.*;

public class Persona {

	
	//variabili
	public String nome;
	public String cognome;
	public int eta;
	char sex;
	
	public Persona () {
		
	}

	public Persona(String n, 
				   String cognome, 
				   int eta, 
				   char sex)
	{
		nome = n;
		this.cognome = cognome;
		this.eta = eta;
		this.sex = sex;
	}
	
	public char getSex() {
		return sex;
	}
	
	public void setSex(char sex) {
		if (sex == 'm') sex = 'M';
		if (sex == 'f') sex = 'F';
			this.sex = sex;
	}

}
