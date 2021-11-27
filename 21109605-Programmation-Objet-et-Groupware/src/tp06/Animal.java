package tp06;

/** Cr�ation et gestion d'animaux */
public abstract class Animal {
	private String esp�ce;
	private String peau;

	/**
	 * cr�ation d'une nouvelle instance de la classe Animal
	 * 
	 * @param type   nom de l'esp�ce
	 * @param poils_plumes_�cailles type de peau
	 */
	public Animal(String type, String poils_plumes_�cailles) {
		esp�ce = type;
		peau = poils_plumes_�cailles;
	}

	/** pr�sentation des caract�ristiques de l'animal */
	public void pr�sente() {
		System.out.println("je suis un repr�sentant de l'esp�ce des " + esp�ce + " et j'ai des " + peau);
	}

	/** cri de l'animal */
	public abstract void crie();
}
