package villagegaulois;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Fichier {
	public static void ecrire(String texte) {
		try {
			File f = new File("./musee.ml");
			f.createNewFile();
			FileWriter fw = new FileWriter(f, false);
			fw.write(texte + "\n");
			fw.flush();
			fw.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
