
import java.io.*;;

public class TestCopieParByte  {
	
	public static final String REP = "C:\\TMP\\TESTFICS\\";
	
	public static void main(String[] args) throws IOException  {
		
		String nfIn = REP+"lorem.doc";
		String nfOut = REP+"copieLoremByte.doc";
		//String nfIn2 = REP+"fichierTest.docx";
		//String nfOut2 = REP+"copiefichierTest.docx";
		//String nfIn3 = REP+"image.jpg";
		//String nfOut3 = REP+"copieimage.jpg";
				
		FileInputStream fis = new FileInputStream(nfIn);
		FileOutputStream output = new FileOutputStream(nfOut);		
		//FileInputStream fis = new FileInputStream(nfIn2);
		//FileOutputStream output = new FileOutputStream(nfOut2);
		//FileInputStream fis = new FileInputStream(nfIn3);
		//FileOutputStream output = new FileOutputStream(nfOut3);
		
		int val;
		while ( (val = fis.read() ) != -1 ) {
			output.write(val);
		}
		
		output.close();
		fis.close();		
		
		
	}
}