package tp05;

/**Gestion d'étudiants
 * @author biard*/
public class Promotion {
	/**Méthodes relatives à Etudiant*/
	public void s_apelle() {
		System.out.println("Cet étudiant s'appelle" + Etudiant.getNom);
	}
	public void numero() {
		System.out.println("Le numéro d'étudiant de" + Etudiant.getNom + "est" + Etudiant.getNumet);
	}
	public void naissance() {
		System.out.println("Il/elle est né(e) le" + Etudiant.getDob);
	}
}
