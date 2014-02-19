import fr.iutvalence.java.tp.Puissance4.*;

/**
 * création de la classe afin de démarrer une partie de Puissance4
 * 
 * @author mirandlu
 */
public class LanceurdePuissance4
{
	/**
	 * déclaration de la méthode main
	 */
	public static void main(String[] args)
	{
		System.out.println("Création de la partie");
		Puissance4 partiedePuissance4 = new Puissance4();
		System.out.println("Démarrage de la partie");
		partiedePuissance4.jouer();
		System.out.println("Fin de la partie");
	}
}
