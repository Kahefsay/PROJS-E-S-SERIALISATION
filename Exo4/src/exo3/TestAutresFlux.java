package exo3;


import java.awt.BorderLayout;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.*;

public class TestAutresFlux {

	public static final String REP = "C:\\TMP\\TESTFICS\\";

	public static void main(String[] args) throws IOException {
		
		String nomFic = REP+"page.html";
		String nomURL = "https://webdev.iut-blagnac.fr/~apeninou";
		URL url = new URL(nomURL);
		URLConnection uc = url.openConnection();
		
		// A vous ...
		// Charger un stream sur une page web et appeler TestAutresFlux.lectureFluxHTML (...)
		
		FileInputStream fis = new FileInputStream(nomFic);
		
		InputStream is = uc.getInputStream();
		
		lectureFluxHTML(fis, 1200,600);
		lectureFluxHTML(is,600,600);
		
		
		// Pour dernière question
		/*String [] texteHtml = {
			"<html>",
			"<body>",
			"<h1>texte en flot</h1>",
			"<h1>dans le programme</h1>",
			"<p>CETTE PAGE EST SPECIALE</p>",
			"</body></html>"
		};*/
	}
	
	/*
	 * param 	fluxHTML	flux (stream byte) html que l'on veut afficher
	 * param	x			position x de la fenêtre générée
	 * param	y			position y de la fenêtre générée
	 */
	private static void lectureFluxHTML (InputStream fluxHTML, int x, int y) throws IOException {
		
		String result = "";
		// A vous ..
		// Remplir result avec le texte html venant de fluxHTML
		BufferedInputStream bis = new BufferedInputStream(fluxHTML);
		InputStreamReader isr = new InputStreamReader(bis);
		
		
		int val;
		while ( (val = isr.read()) != -1) {
			result += (char) val;
		}
		
		isr.close();
		bis.close();
		
		
		JFrame fenetre = TestAutresFlux.genererJFrameAvecAffichageHTML(result, x, y);
        fenetre.setVisible(true);       
	}
	
	private static JFrame genererJFrameAvecAffichageHTML (String texteHTML, int x, int y) {
		
		JFrame jf = new JFrame("Test") ;
        jf.setBounds(x,  y, 300,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		JTextPane textPane = new JTextPane();
        textPane.setContentType("text/html");
        textPane.setEditable(false);
        textPane.setText(texteHTML);
        
        JScrollPane jsp = new JScrollPane(textPane);
        jf.add(jsp, BorderLayout.CENTER);
        
        return jf;
	}
}