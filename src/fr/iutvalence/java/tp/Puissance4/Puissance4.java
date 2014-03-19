package fr.iutvalence.java.tp.Puissance4;

// TODO (fait) écrire un commentaire 
/**
 * @author mirandlu
 *	La classe qui représente une partie (prete a jouer, ou en cours de jeu)
 */
public class Puissance4
{
	
	/**
	 *  Création d'un attribut grille de type Grille 
	 */
	private Grille grille;

	/**
	 * Création d'un attribut joueur1 de type Joueur
	 */
	private Joueur joueur1;
	
	/**
	 * Création d'un attribut joueur2 de type Joueur
	 */
	private Joueur joueur2;

	/**
	 * Création d'un attribut joueuractuel de type Joueur pour savoir quel est le joueur qui joue
	 */
	private Joueur joueuractuel;
	
	/**
	 * Création d'un attribut pour le résultat
	 */
	private Puissance4 resultat;
	
	/**
	 * Création d'une nouvelle partie, avec 2 nouveaux joueurs et une grille  vide.
	 */
	public Puissance4()
	{
		this.grille = new Grille();
		this.joueur1 = new Joueur();
		this.joueur2 = new Joueur();
	
	}

	@Override
	public String toString()
	{
		return this.grille.toString();
	}

	
	/**
	 *  Création de la procédure permettant de passer au joueur suivant
	 */
	private void joueurSuivant () 
	{
	if (this.joueuractuel == this.joueur1)
	this.joueuractuel = this.joueur2 ;
	else
	this.joueuractuel = this.joueur1 ;
	
	/**
	 * Création de la fonction permettant de savoir si une une case est libre
	 */
	private boolean caseLibre (int colones) 
	{
		return grille[colones][lignes] == Emplacement.VIDE ;
	}
	
	/**
	 * Création de la procédure getColone pour savoir dans quelle colone jouer
	 */
	private void getColone (int colones) {
		if (caseLibre == Emplacement.VIDE)
		System.out.println( " La colonne est pleine " ) ;
		else
		//On affecte a cette meme colone la nouvelle valeur ?
		
	}
	

	/**
	 * Jouer la partie
	 */
	public void jouer()
	{
		 while (NbPionsAllignes<4)
			 if (this.joueuractuel = joueur1)
			 	getColone()
			 else 
				 joueurSuivant()
			if (resultat == Emplacement.VIDE)
				System.out.println( " La partie est nulle (égalité) " ) ;
			else
				System.out.println(this.joueuractuel + " gagne " ) ;
	
		
}