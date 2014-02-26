package fr.iutvalence.java.tp.Puissance4;

/**
 * @author mirandlu
 * La classe qui définit la grille où se joue la partie de puissance 4
 */
public class Grille
{
	/**
	 * Déclaration de la constante pour l'emplacement vide
	 */
	// TODO (fait) écrire un commentaire
	// TODO (fait) respecter les conventions d'écriture
	public final static int EMPLACEMENTVIDE = 0;

	/**
	 * Déclaration de la constante pour l'emplacement d'un pion Jaune
	 */
	// TODO (fait) écrire un commentaire
	// TODO (fait)  respecter les conventions d'écriture
	public final static int EMPLACEMENTJAUNE = 1;
	
	/**
	 * Déclaration de la constante pour l'emplacement d'un pion Rouge
	 */
	// TODO (fait)  écrire un commentaire
	// TODO (fait) respecter les conventions d'écriture
	public final static int EMPLACEMENTROUGE = 2;

	/**
	 * Création de l'attribut emplacement grille de type tableau (2 dimmensions)
	 */
	public  int[][] emplacementgrille;
	 
	/**
	 * Création d'un constante définissant la Largeur par défault
	 */
	private final static int LARGEUR_DEFAULT = 6;
	
	/**
	 * Création d'un constante définissant la hauteur par défault
	 */
	private final static int HAUTEUR_DEFAULT = 7;
	
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
		emplacementgrille = new int[this.hauteur][this.largeur];
	}
}
