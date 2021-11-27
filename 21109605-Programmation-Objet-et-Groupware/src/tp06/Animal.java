package tp06;

/** Création et gestion d'animaux */
public abstract class Animal {
	private String espèce;
	private String peau;

	/**
	 * création d'une nouvelle instance de la classe Animal
	 * 
	 * @param type   nom de l'espèce
	 * @param poils_plumes_écailles type de peau
	 */
	public Animal(String type, String poils_plumes_écailles) {
		espèce = type;
		peau = poils_plumes_écailles;
	}

	/** présentation des caractéristiques de l'animal */
	public void présente() {
		System.out.println("je suis un représentant de l'espèce des " + espèce + " et j'ai des " + peau);
	}

	/** cri de l'animal */
	public abstract void crie();
}
