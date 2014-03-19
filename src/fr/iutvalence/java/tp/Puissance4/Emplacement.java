package fr.iutvalence.java.tp.Puissance4;

/**
 * Création de la classe pour énumération pour les constantes des emplacements
 * (vide, prise par pion jaune ou rouge)
 */
public enum Emplacement
{
	/**
	 * Déclaration de la constante pour l'emplacement vide
	 */
	VIDE,
	/**
	 * Déclaration de la constante pour l'emplacement d'un pion Jaune
	 */
	JAUNE,
	/**
	 * Déclaration de la constante pour l'emplacement d'un pion Rouge
	 */
	ROUGE;
	

	public String toString()
	{
		if (this == JAUNE)
			return "J";
		if (this == ROUGE)
			return "R";
		return "V";
	}
}
