package tp05;

/**Cr�ation d'�tudiants
 * @author biard*/
public class Etudiant {
	//Attributs des �tudiants : nom, num�ro �tudiant, date de naissance
	private String nom;
	private int num_et;
	private int dob;
	
	/**Cr�ation d'une instance d'�tudiant
	 * @param nom	nom de l'�tudiant
	 * @param num_et	num�ro d'�tudiant
	 * @param dob	date de naissance de l'�tudiant*/
	public Etudiant(String nom, int num_et, int dob){
		this.nom = nom;
		this.num_et = num_et;
		this.dob = dob;
	}
	
	/**Ouverture contr�l�e des attributs � d'autres classes*/
	//On rend l'acc�s aux attributs possible � la classe Promotion avec des getters et des setters
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
