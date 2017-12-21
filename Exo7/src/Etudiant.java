import java.io.Serializable;

public class Etudiant extends Personne
	
{
	
	private int numeroEtu;
	private String promo;

	
	public Etudiant() {
		this("sans nom", "sans prenom", 0, "sans promo");
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