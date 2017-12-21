import java.io.*;

public class Test_7_1_SerialisationPersonne {

	public static final String REP = "C:\\TMP\\TESTFICS\\";
	
	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException  {
		
		String nomFic = REP + "persSerialise.dat";
		
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
		
		ObjectOutputStream dos = new ObjectOutputStream(new FileOutputStream(nomFic));
		ObjectInputStream dis = new ObjectInputStream(new FileInputStream(nomFic));
		
		// A vous ... sérialisation de p1 et p2
		dos.writeObject(p1);
		dos.writeObject(p2);
		
		dos.close();
		
		Personne p3, p4;
		
		// Désérialiser ici les datas enregistrées dans p3, p4
		p3 = (Personne) dis.readObject();
		p4 = (Personne) dis.readObject();
		
		System.out.println(p3);
		System.out.println(p4);
		
	}
}