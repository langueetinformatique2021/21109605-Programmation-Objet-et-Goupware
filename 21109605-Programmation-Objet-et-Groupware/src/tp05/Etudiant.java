package tp05;

/**Création d'étudiants
 * @author biard*/
public class Etudiant {
	//Attributs des étudiants : nom, numéro étudiant, date de naissance
	private String nom;
	private int num_et;
	private int dob;
	
	/**Création d'une instance d'étudiant
	 * @param nom	nom de l'étudiant
	 * @param num_et	numéro d'étudiant
	 * @param dob	date de naissance de l'étudiant*/
	public Etudiant(String nom, int num_et, int dob){
		this.nom = nom;
		this.num_et = num_et;
		this.dob = dob;
	}
	
	/**Ouverture contrôlée des attributs à d'autres classes*/
	//On rend l'accès aux attributs possible à la classe Promotion avec des getters et des setters
	public void setNom(String nom) {
	    this.nom = nom;
	}
	public String getNom() {
	    return this.nom;
	}
	
	public void setNumet(int num_et) {
		this.num_et = num_et;
	}
	public int getNumet() {
		return this.num_et;
	}
	
	public void setDOB(int dob) {
		this.dob = dob;
	}
	public int getDOB() {
		return this.dob;
	}
}
