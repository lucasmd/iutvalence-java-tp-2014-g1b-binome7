package fr.iutvalence.java.tp.Puissance4;

/**
 * @author mirandlu La classe qui définit la grille où se joue la partie de
 *         puissance 4
 */
public class Grille
{

	// TODO(fait) constantes à remplacer par une énumération

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
	private Emplacement[][] cases;

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
		this.cases = new Emplacement[this.hauteur][this.largeur];
	}

	/**
	 * A faire : tester chaque colone et ligne (toutes les cases) et mettre
	 * leurs valeurs (V, R ou J)
	 */
	@Override
	public String toString()
	{
		String result = "";
		for (int colonnes = 0; colonnes < this.largeur; colonnes++)
		{
			for (int lignes = 0; lignes < this.hauteur; lignes++)
				result += Emplacement.VIDE.toString();
			result += '\n';
		}
		return result;
	}
	/**
	 * methode qui permet de renvoyer l'état d'un emplacement
	 * @return 
	 */
	public Emplacement etatEmplacement(int numeroDeligne,int numeroDeColonne)
	{
		return this.cases[numeroDeligne][numeroDeColonne];
	}


}
