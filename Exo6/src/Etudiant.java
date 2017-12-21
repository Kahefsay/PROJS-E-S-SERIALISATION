import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Etudiant extends Personne {
	protected int numeroEtu;
	protected String promo;

	public Etudiant() {
		this("sans nom", "sans prenom", 0, "sans promo");
	}
	
	public static void recordEtudiant (Etudiant etu, DataOutputStream os) throws IOException  {
		os.writeUTF(etu.nom);
		os.writeUTF(etu.prenom);
		os.writeInt(etu.numeroEtu);
		os.writeUTF(etu.promo);
		Adresse.recordAdresse(etu.adr, os);
		os.writeInt(etu.nbAdrAjoutees);
		for(int i = 0; i < etu.nbAdrAjoutees; i++) {
			Adresse.recordAdresse(etu.lesAdrs.get(i), os);
		}
	}
	public static void readEtudiant (Etudiant etu, DataInputStream is) throws IOException {
		etu.nom = is.readUTF();
		etu.prenom = is.readUTF();
		etu.numeroEtu = is.readInt();
		etu.promo = is.readUTF();
		Adresse.readAdresse(etu.adr, is);
		etu.nbAdrAjoutees = is.readInt();
		etu.lesAdrs = new ArrayList<Adresse>();
		
		for(int i = 0; i < etu.nbAdrAjoutees; i++) {
			Adresse a = new Adresse();
			Adresse.readAdresse(a, is);
			etu.lesAdrs.add(a);						
		}
	}
	
	public Etudiant(String n, String p, int numeroEtu, String promo) {
		super(n, p);
		this.numeroEtu = numeroEtu;
		this.promo = promo;
	}

	@Override
	public String toString() {
		return "Etudiant ["+System.identityHashCode(this)+", numeroEtu=" + numeroEtu + ", promo=" + promo
				+ ", "+ super.toString() + "]";
	}

	public int getNumeroEtu() {
		return numeroEtu;
	}

	public void setNumeroEtu(int numeroEtu) {
		this.numeroEtu = numeroEtu;
	}

	public String getPromo() {
		return promo;
	}

	public void setPromo(String promo) {
		this.promo = promo;
	}
}