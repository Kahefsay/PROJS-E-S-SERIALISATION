
import java.io.*;

public class Test_6_2_EnregChargeEtudiant {

	public static final String REP = "C:\\TMP\\TESTFICS\\";
	
	public static void main(String[] args) throws ClassNotFoundException, IOException  {
		
		String nomFic = REP+"etu.dat";
		
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
		
		// A vous ... enregistrez e1 et e2
		
		DataOutputStream out = new DataOutputStream ( new BufferedOutputStream(new FileOutputStream(nomFic)));
		
		Etudiant.recordEtudiant(e1, out);
		Etudiant.recordEtudiant(e2, out);
		
		out.close();
		
		DataInputStream in = new DataInputStream (new BufferedInputStream(new FileInputStream(nomFic)));
		
		Etudiant e3 = new Etudiant(), e4 = new Etudiant();
		
		
		// Lire ici les datas enregistrées dans e3, e4
		
		Etudiant.readEtudiant(e3, in);
		Etudiant.readEtudiant(e4, in);
		
		in.close();
		
		System.out.println(e3);
		System.out.println(e4);
	}
}