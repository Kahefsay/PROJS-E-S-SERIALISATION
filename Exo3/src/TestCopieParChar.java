import java.io.*;

public class TestCopieParChar {

	public static final String REP = "C:\\TMP\\TESTFICS\\";
	
	public static void main(String[] args) throws IOException  {
		
		// Vous pouvez essayer avec un fichier binaire très long (à trouver sur le disque)
		
		String nfIn = REP+"original.txt";
		String nfOut = REP+"copieOriginal.txt";
		
		FileReader fis = new FileReader(nfIn);
		FileWriter output = new FileWriter(nfOut);
		
		int val;
		char charLu;
		
		while ( (val = fis.read()) != -1 ) {
			charLu = (char) val;
			output.write(charLu);
		}
		
		output.close();
		fis.close();
		
		
	}
}