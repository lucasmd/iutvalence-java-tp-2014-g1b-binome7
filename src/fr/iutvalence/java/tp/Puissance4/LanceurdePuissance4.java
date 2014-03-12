package fr.iutvalence.java.tp.Puissance4;

// TODO (fait) déplacer la classe dans un paquetage


// TODO(fait) écrire un commentaire précis
/**
 * La classe qui représente le menu de démarrage de la partie de Puissance4
 * 
 * @author mirandlu
 */
public class LanceurdePuissance4
{
	// TODO (fait) écrire un commentaire précis
	/**
	 * déclaration de la méthode main permettant de créer la partie, et de la démarrer 
	 * une sorte de "menu"
	 */
	public static void main(String[] args)
	{
		System.out.println("Création de la partie");
		Puissance4 partiedePuissance4 = new Puissance4();
		System.out.println("Démarrage de la partie");
		System.out.println(partiedePuissance4.toString());
		//partiedePuissance4.jouer();
		System.out.println("Fin de la partie");
	}
}
