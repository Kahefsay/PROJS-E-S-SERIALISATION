import java.io.*;

public class TestDataStream {
	
	public static final String REP = "C:\\TMP\\TESTFICS\\";

	public static void main(String[] args)  throws Exception{
		int[] entiers = { 12, 8, 13, 29, 50, 78, 89, 21 };
		String nomFic = REP+"ficEntiers.don";
				// La somme doit faire 300 ...
		
		// A vous ...
		DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(nomFic)));
		
		for (int e : entiers) {
			out.writeInt(e);
		}
		
		out.close();
		
		DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(nomFic)));
		int sum = 0;
		while (in.available() != 0) {
			int val = in.readInt();
			//float val = in.readFloat();
			//boolean val = in.readBoolean();
			//String val = in.readUTF()
			sum += val;
			System.out.println(val);
		}
		
		in.close();
		System.out.println(sum);
		
	}

}