package tp05;

/**Gestion d'�tudiants
 * @author biard*/
public class Promotion {
	/**M�thodes relatives � Etudiant*/
	public void s_apelle() {
		System.out.println("Cet �tudiant s'appelle" + Etudiant.getNom);
	}
	public void numero() {
		System.out.println("Le num�ro d'�tudiant de" + Etudiant.getNom + "est" + Etudiant.getNumet);
	}
	public void naissance() {
		System.out.println("Il/elle est n�(e) le" + Etudiant.getDob);
	}
}
