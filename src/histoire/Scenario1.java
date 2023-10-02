package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario1 {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		asterix.parler("Bonjour à tous");
		Romain minus = new Romain("Minus", 6);
		minus.parler("UN GAU... UN GAUGAU...");
		for (int i = 0; i < 3; i++) {
			asterix.frapper(minus);
		}
		
//		RESULTAT exo 4.2.1:
//			Le gaulois Astérix : « Bonjour à tous»
//			Le romain Minus : « UN GAU... UN GAUGAU...»
//			Astérix envoie un grand coup dans la mâchoire de Minus
//			Le romain Minus : « Aïe»
//			Astérix envoie un grand coup dans la mâchoire de Minus
//			Le romain Minus : « Aïe»
//			Astérix envoie un grand coup dans la mâchoire de Minus
//			Le romain Minus : « J'abandonne...»

	}

}
