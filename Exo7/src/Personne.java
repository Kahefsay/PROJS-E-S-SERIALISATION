import java.io.Serializable;
import java.util.ArrayList;

public class Personne implements Serializable
	
{
	
	private static final long serialVersionUID = 1L;
	private String nom, prenom;
	private Adresse adr ;
	private transient int nbAdrAjoutees;
	private ArrayList<Adresse> lesAdrs;

	
	public Personne () {
		this ("sans nom", "sans prenom");
	}
	
	
	public Personne (String n, String p) {
		this.nom = n;
		this.prenom = p;
		this.adr = new Adresse (10, "Rue "+nom, "31000", "Ville "+prenom);
		this.nbAdrAjoutees = 0;
		this.lesAdrs = new ArrayList<Adresse> ();
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
		s += "Nb adrs: " + nbAdrAjoutees;
		return s;
	}
}