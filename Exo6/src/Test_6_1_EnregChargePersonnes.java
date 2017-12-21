import java.io.*;

public class Test_6_1_EnregChargePersonnes {
	
	public static final String REP = "C:\\TMP\\TESTFICS\\";

	public static void main(String[] args) throws IOException  {
		
		String nomFic = REP+"pers.dat";
		
		Personne p1 = new Personne ("Ochon", "Paul");
		p1.ajouteAdr(new Adresse (1, "1", "1", "1"));
		p1.ajouteAdr(new Adresse (2, "2", "2", "2"));
		p1.ajouteAdr(new Adresse (3, "3", "3", "3"));
		
		Personne p2 = new Personne ("Autre personne", "Lui");
		p2.ajouteAdr(new Adresse (11, "11", "11", "11"));
		p2.ajouteAdr(new Adresse (12, "12", "12", "12"));
		p2.ajouteAdr(new Adresse (13, "13", "13", "13"));

		System.out.println(p1);
		System.out.println(p2);
		
		// A vous ... enregistrez p1 et p2
		DataOutputStream out = new DataOutputStream ( new BufferedOutputStream(new FileOutputStream(nomFic)));
		
		Personne.recordPersonne(p1, out);
		Personne.recordPersonne(p2, out);
		
		out.close();
		
		DataInputStream in = new DataInputStream (new BufferedInputStream(new FileInputStream(nomFic)));
		
		Personne p3 = new Personne(), p4 = new Personne();
		
		// Lire ici les datas enregistrées dans p3, p4
		Personne.readPersonne(p3, in);
		Personne.readPersonne(p4, in);
		
		in.close();
		
		System.out.println(p3);
		System.out.println(p4);
	}

}