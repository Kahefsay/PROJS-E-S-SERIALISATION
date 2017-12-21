import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;


public class Personne  {
	
	protected String nom, prenom;
	protected Adresse adr ;
	protected int nbAdrAjoutees = 0;
	protected ArrayList<Adresse> lesAdrs;
	
	public Personne () {
		this ("sans nom", "sans prenom");
	}
	
	public static void recordPersonne (Personne per, DataOutputStream os) throws IOException  {
		os.writeUTF(per.nom);
		os.writeUTF(per.prenom);
		Adresse.recordAdresse(per.adr, os);
		os.writeInt(per.nbAdrAjoutees);
		for(int i = 0; i < per.nbAdrAjoutees; i++) {
			Adresse.recordAdresse(per.lesAdrs.get(i), os);
		}
	}
	public static void readPersonne (Personne per, DataInputStream is) throws IOException {
		per.nom = is.readUTF();
		per.prenom = is.readUTF();
		Adresse.readAdresse(per.adr, is);
		per.nbAdrAjoutees = is.readInt();
		per.lesAdrs = new ArrayList<Adresse>();
		
		for(int i = 0; i < per.nbAdrAjoutees; i++) {
			Adresse a = new Adresse();
			Adresse.readAdresse(a, is);
			per.lesAdrs.add(a);						
		}
	}
	
	public Personne (String n, String p) {
		this.nom = n;
		this.prenom = p;
		this.adr = new Adresse (10, "Rue "+nom, "31000", "Ville "+prenom);
		this.nbAdrAjoutees = 0;
		this.lesAdrs = new ArrayList<Adresse>();
	}

	public void setNomPrenom (String n, String p) {
		this.nom = n;
		this.prenom = p;
	}

	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}
	
	public void ajouteAdr (Adresse a) {
		this.nbAdrAjoutees++;
		this.lesAdrs.add(a);
	}
	
	@Override
	public String toString () {
		String s;
		s = "Personne ["+System.identityHashCode(this)+", " + "call : " + this.nbAdrAjoutees+ ", nom : "+this.nom+", prénom : "+this.prenom + ", adr : " +this.adr+"\n";
		for(Adresse a : this.lesAdrs)
			s+="   "+a+"\n";
		s += "]";
		return s;
	}
}