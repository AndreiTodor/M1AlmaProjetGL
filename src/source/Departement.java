package source;
import java.util.HashSet;

/**
 * Classe d�finissant un departement.
 */
public class Departement {
	
	public HashSet<Enseignant> enseignants = new HashSet<Enseignant>();
	public HashSet<Parcours> parcourss = new HashSet<Parcours>();
	public String nom = "";
	
	/**
	 * The constructor.
	 */
	public Departement() {
		super();
	}
	
	/**
	 * Returns enseignants.
	 * @return enseignants 
	 */
	public HashSet<Enseignant> getEnseignants() {
		return this.enseignants;
	}

	/**
	 * Returns parcourss.
	 * @return parcourss 
	 */
	public HashSet<Parcours> getParcourss() {
		return this.parcourss;
	}

	/**
	 * Returns nom.
	 * @return nom 
	 */
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * Sets a value to attribute nom. 
	 * @param newNom 
	 */
	public void setNom(String newNom) {
	    this.nom = newNom;
	}



}
