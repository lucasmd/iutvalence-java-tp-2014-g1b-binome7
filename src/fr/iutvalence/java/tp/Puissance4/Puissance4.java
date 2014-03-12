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
	 * Jouer la partie
	 */
/*	public void jouer()
	{
		 while (NbPionsAllignes<4)
			 if (joueur1 a joué)
			 	joueur2 joue
			 else joueur1 joue*/
		 /* Afin de jouer il faudrait faire un getColone() ou le joueur dise le numéro
		  * de colone ou il veut placer son pion */
	
		

	}

