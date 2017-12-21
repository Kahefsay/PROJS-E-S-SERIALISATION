import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Adresse  {

	protected int numero;
	protected String rue;
	protected String codePost;
	protected String ville;


	public static void recordAdresse (Adresse adr, DataOutputStream os) throws IOException  {
		os.writeInt(adr.numero);
		os.writeUTF(adr.rue);
		os.writeUTF(adr.codePost);
		os.writeUTF(adr.ville);
	}
	public static void readAdresse (Adresse adr, DataInputStream is) throws IOException {
		adr.numero = is.readInt();
		adr.rue = is.readUTF();
		adr.codePost = is.readUTF();
		adr.ville = is.readUTF();
	}

	
	public Adresse() {
		this(0, "","","");
	}
	
	public Adresse(int numero, String rue, String codePost, String ville) {
		super();
		this.numero = numero;
		this.rue = rue;
		this.codePost = codePost;
		this.ville = ville;
	}
	
	public String getCodePost() {
		return codePost;
	}
	public void setCodePost(String codePost) {
		this.codePost = codePost;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	@Override
	public String toString() {
		return "Adresse ["+System.identityHashCode(this)+", numero=" + numero + ", rue=" + rue + ", codePost="
				+ codePost + ", ville=" + ville + "]";
	}
}