package exo2;

import java.io.*;


public class TestCopieBuffChar {

	public static final String REP = "C:\\TMP\\TESTFICS\\";

	public static void main(String[] args) throws IOException {
		
		//String nfIn = REP+"longFic.txt";
		//String nfOut = REP+"copielongFic.txt";
		String nfIn = REP+"tresLongFic.txt";
		String nfOut = REP+"copietresLongFic.txt";
						
		FileReader fr = new FileReader(nfIn);
		BufferedReader br = new BufferedReader(fr);
				
		FileWriter fw = new FileWriter(nfOut);
		BufferedWriter bw = new BufferedWriter(fw);
				
		String line;
		while ( ( line = br.readLine() ) != null ) {
			bw.write(line + System.lineSeparator());
		}

		bw.close();
		fw.close();
				
		br.close();
		fr.close();
				
	}
}