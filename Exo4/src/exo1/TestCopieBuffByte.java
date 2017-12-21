package exo1;

import java.io.*;


public class TestCopieBuffByte {

	public static final String REP = "C:\\TMP\\TESTFICS\\";

	public static void main(String[] args) throws IOException {
		
		//String nfIn = REP+"longFic.txt";
		//String nfOut = REP+"copielongFic.txt";
		String nfIn = REP+"tresLongFic.txt";
		String nfOut = REP+"copietresLongFic.txt";
				
		FileInputStream fis = new FileInputStream(nfIn);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream(nfOut);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int val;
		while ( (val = bis.read() ) != -1 ) {
			bos.write(val);
		}
		
		bos.close();
		fos.close();
		
		bis.close();
		fis.close();
		
	}
}