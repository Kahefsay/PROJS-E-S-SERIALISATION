

import java.io.*;


public class Test_7_2_SerialisationEtudiant {

	public static final String REP = "C:\\TMP\\TESTFICS\\";
	
	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException  {
		
		String nomFic = REP+"etuSerialise.dat";
		
		Etudiant e1 = new Etudiant("Ochon", "Paul", 10020, "LP APSIO");
		e1.ajouteAdr(new Adresse (1, "1", "1", "1"));
		e1.ajouteAdr(new Adresse (2, "2", "2", "2"));
		e1.ajouteAdr(new Adresse (3, "3", "3", "3"));
		
		Etudiant e2 = new Etudiant ("Autre personne", "Lui", 78895, "DUT 2A");
		e2.ajouteAdr(new Adresse (11, "11", "11", "11"));
		e2.ajouteAdr(new Adresse (12, "12", "12", "12"));
		e2.ajouteAdr(new Adresse (13, "13", "13", "13"));
		
		System.out.println(e1);
		System.out.println(e2);
		
		// A vous ... sérialisation de e1 et e2 
		
		
		
		Etudiant e3, e4;
		
		// Désérialiser ici les datas enregistrées dans e3, e4
	}
}
