

import java.io.*;
import java.util.ArrayList;

public class TestSerialisationEtReferences {
	
	public static final String REP = "C:\\TMP\\TESTFICS\\";
	
	public static void main(String[] args)
			throws IOException, ClassNotFoundException {

		String nomFicUN = REP+"testFicsSerUN.dat";
		String nomFicDEUX = REP+"testFicsSerDEUX.dat";
		
		House house = new House();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		// On met dans animals trois Animal ayant le même House
		
		animals.add( new Animal("Bosco the dog", house) );
		animals.add( new Animal("Ralph the hamster", house) );
		animals.add (new Animal("Fronk the cat", house) );
		
		
	}
}
