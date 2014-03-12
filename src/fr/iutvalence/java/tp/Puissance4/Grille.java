package fr.iutvalence.java.tp.Puissance4;

/**
 * @author mirandlu La classe qui définit la grille où se joue la partie de
 *         puissance 4
 */
public class Grille
{
	// TODO constantes à remplacer par une énumération
	/**
	 * Déclaration de la constante pour l'emplacement vide
	 */
	// TODO (fait) écrire un commentaire
	// TODO (fait) respecter les conventions d'écriture
	public final static int EMPLACEMENT_VIDE = 0;

	/**
	 * Déclaration de la constante pour l'emplacement d'un pion Jaune
	 */
	// TODO (fait) écrire un commentaire
	// TODO (fait) respecter les conventions d'écriture
	public final static int EMPLACEMENT_JAUNE = 1;

	/**
	 * Déclaration de la constante pour l'emplacement d'un pion Rouge
	 */
	// TODO (fait) écrire un commentaire
	// TODO (fait) respecter les conventions d'écriture
	public final static int EMPLACEMENT_ROUGE = 2;

	/**
	 * Création d'un constante définissant la Largeur par défault
	 */
	private final static int LARGEUR_DEFAULT = 6;

	/**
	 * Création d'un constante définissant la hauteur par défault
	 */
	private final static int HAUTEUR_DEFAULT = 7;

	/**
	 * Création de l'attribut emplacement grille de type tableau (2 dimmensions)
	 */
	private int[][] cases;

	/**
	 * Création de l'attribut hauteur
	 */
	private int hauteur;

	/**
	 * Création de l'attribut largeur
	 */
	private int largeur;

	/**
	 * Création du constructeur permettant de créer une grille (vide au début)
	 */
	public Grille()

	{
		this.hauteur = HAUTEUR_DEFAULT;
		this.largeur = LARGEUR_DEFAULT;
		this.cases = new int[this.hauteur][this.largeur];
	}

	@Override
	public String toString()
	{
		String result = "";
		for (int colones = 0; colones < this.largeur; colones++)
		{
			for (int lignes = 0; lignes < this.hauteur; lignes++)
				result += " 0 " ;
			result += '\n';
		}
		return result;
	}

}
