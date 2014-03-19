package fr.iutvalence.java.tp.Puissance4;

/**
 * @author mirandlu Création de la classe Joueur permettant de leurs attribuer
 *         une couleur et des pions
 */
public class Joueur
{
	/**
	 * Création de la procédure getColone pour savoir dans quelle colone jouer
	 */
	private void getColone () {
		if (caseLibre == Emplacement.VIDE)
		System.out.println( " La colonne est pleine " ) ;
		else
			if (Puissance4.joueuractuel == Puissance4.joueur1)
				Emplacement.VIDE=Emplacement.ROUGE;
			else
				Emplacement.VIDE=Emplacement.JAUNE;
			
	}
}
