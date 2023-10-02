package histoire;

import personnages.Druide;
import personnages.Equipement;
import personnages.Gaulois;
import personnages.Romain;
import villagegaulois.Fichier;
import villagegaulois.Musee;

public class Scenario3 {

	public static void main(String[] args) {
		Druide druide = new Druide("Panoramix", 5, 10);
		druide.parler("Je vais aller préparer une petite potion...");
		druide.preparerPotion();
		Gaulois obelix = new Gaulois("Obélix", 25);
		Gaulois asterix = new Gaulois("Astérix", 8);
		druide.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		druide.booster(asterix);
		asterix.parler("Bonjour");
		Romain minus = new Romain("Minus", 6);
		Romain milexcus = new Romain("Milexcus", 8);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		milexcus.sEquiper(Equipement.CASQUE);
		minus.parler("UN GAU... UN GAUGAU...");
		do {
			asterix.frapper(minus);
		} while (minus.getForce() > 0);
		milexcus.parler("UN GAU... UN GAUGAU...");
		do {
			asterix.frapper(milexcus);
		} while (milexcus.getForce() > 0);

		Musee musee = new Musee();
		asterix.faireUneDonnation(musee);

		// Sortie console
		// Fichier.afficher(musee.extraireInstructionsCaml());
		
		// Sortie dans un fichier
		// Fichier.ecrire(musee.extraireInstructionsCaml());

		// Sortie Caml attendue:
		// let resultat = ["Asterix", [3,"casque";2,"bouclier"]] ; ["Obelix",
		// [1,"casque";1,"bouclier"]]

//		RESULTAT exo 4.2.1:
//			Le gaulois Astérix : « Bonjour à tous»
//			Le romain Minus : « UN GAU... UN GAUGAU...»
//			Astérix envoie un grand coup dans la mâchoire de Minus
//			Le romain Minus : « Aïe»
//			Astérix envoie un grand coup dans la mâchoire de Minus
//			Le romain Minus : « Aïe»
//			Astérix envoie un grand coup dans la mâchoire de Minus
//			Le romain Minus : « J'abandonne...»

//		RESULTAT exo 4.2.2:
//		Le druide Panoramix : « Bonjour, je suis le druide Panoramix et ma potion peut aller d'une force 5 à 10.»
//		Le druide Panoramix : « Je vais aller préparer une petite potion...»
//		Le druide Panoramix : « J'ai préparé une super potion de force 8.»
//		Le druide Panoramix : « Non, Obélix !... Tu n'auras pas de potion magique !»
//		Le gaulois Obélix : « Par Bélénos, ce n'est pas juste !»
//		Le gaulois Astérix : « Merci Druide, je sens que ma force est 8 fois décuplée.»
//		Le gaulois Astérix : « Bonjour»
//		Le romain Minus : « UN GAU... UN GAUGAU...»
//		Astérix envoie un grand coup dans la mâchoire de Minus
//		Le romain Minus : « Aïe»
//		Astérix envoie un grand coup dans la mâchoire de Minus
//		Le romain Minus : « Aïe»
//		Astérix envoie un grand coup dans la mâchoire de Minus
//		Le romain Minus : « J'abandonne...»

	}

}
