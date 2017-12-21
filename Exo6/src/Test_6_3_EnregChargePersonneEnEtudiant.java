import java.io.*;

public class Test_6_3_EnregChargePersonneEnEtudiant {
	
	public static final String REP = "C:\\TMP\\TESTFICS\\";

	public static void main(String[] args) throws IOException  {
		
		String nomFic = REP+"pers.dat";		

		// A vous ...
		
		DataInputStream in = new DataInputStream (new BufferedInputStream(new FileInputStream(nomFic)));
		
		Etudiant e1 = new Etudiant(), e2 = new Etudiant();
		
		//Provoque une erreur java.io.EOFException et rien n'est lu
		//Etudiant.readEtudiant(e1, in);
		//Etudiant.readEtudiant(e2, in);
		
		in.close();
		
		System.out.println(e1);
		System.out.println(e2);
		
		String nomFicEtu = REP + "etu.dat";
		
		DataInputStream inEtu = new DataInputStream (new BufferedInputStream(new FileInputStream(nomFicEtu)));
		
		Personne p1 = new Personne(), p2 = new Personne();
		
		// Provoque une erreur java.io.EOFException mais les informations sont lues
		Personne.readPersonne(p1, inEtu);
		Personne.readPersonne(p2, inEtu);
		
		in.close();
		
		System.out.println(p1);
		System.out.println(p2);

	}

}