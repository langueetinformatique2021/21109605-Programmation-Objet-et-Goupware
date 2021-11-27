package tp06;

public class Crocodile extends Reptile {
	//ajout d'attributs propres à la sous-classe
	protected boolean crocodile = true;
	protected int taille = 0;

	/**Nouvelle instance de la classe Crocodile
	 * 
	 * @param mesure	taille du crocodile*/
	public Crocodile(int mesure) {
		super("crocodile");
		taille = mesure;
	}

	public void crie() {
		if (serpent == true)
			System.out.println("Je siffle donc je suis");
		else
			super.crie();
	}
	
	public void rampe() {
		if (crocodile == true)
			System.out.println("Je nage et je suis un reptile");
		else
			super.rampe();
	}
	
	//ajout d'une méthode propre à la sous-classe
	/**Alimentation du crocodile*/
	public void mange() {
		if (taille <= 150)
			System.out.println("Je me nourris d'insectes");
		else {
			if (taille >= 350)
				System.out.println("Je me nourris de mammifères");
			else
				System.out.println("Je me nourris de poissons");
		}
	}
}
