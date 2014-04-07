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
	private void joueurSuivant() 
	{
	if (this.joueuractuel == this.joueur1)
	this.joueuractuel = this.joueur2 ;
	else
	this.joueuractuel = this.joueur1 ;
	
	
	// TODO  Tester aussi si il y a un pion ROUGE ou JAUNE
	/**
	 * Création de la fonction permettant de savoir si une une case est libre
	 */
	private boolean estColonneLibre (int numeroDeColonne) 
	{
		return this.grille.EtatEmplacement(0,numeroDeColonne) == Emplacement.VIDE ;
	}
	
	// TODO Afficher le résultat
	/**
	 * Jouer la partie
	 */
	public void jouer()
	{
		 while (NbPionsAllignes<4)
			 if (this.joueuractuel = joueur1)
			 	Joueur.getColonne()
			 else 
				 joueurSuivant()
			if (caseLibre == false)
				System.out.println("Vous devez rejouer, cette case n'est pas libre");
				Joueur.getColonne();
			else
				System.out.println(this.joueuractuel + " gagne " ) ;
	}
	/**
	 * Création de la méthode permettant de donné le nombre de pion alignés
	 */
	private int nombredepionalignes (int colonne,int ligne, int direction) {
		int i = 0 ;
		if 
		i++ ;
		}
	
	
	/**
	 * Création de la fonction permettant de dire si 4 pions sont alignés 
	 */
	private boolean sontalignés (int position,int direction {
		
			int nbPionsAlignes = 0;  
			
			int DirectionMinimum = DirectionMinimum - 3;
			if (DirectionMinimum <= 0)
			
				
			int	DirectionMaximum = +3;
			if DirectionMaximum >= 0)
				DirectionMaximum = 0;
			
			
			for (int i = DirectionMinimum; i <= DirectionMaximum; i++) {
				if (this.position == ETATEMPLACEMENTSPECIFIQUE)
					nbAlign++;
				else
					nbAlign = 0;

				if (nbAlign == 4)
					return true;
			}
			return false;
		
}