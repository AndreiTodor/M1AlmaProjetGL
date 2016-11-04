package source;
import java.util.HashSet;

/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/


// Start of user code (user defined imports)

// End of user code

/**
 * Description of Departement.
 * 
 * @author andrei
 */
public class Departement {
	/**
	 * Description of the property enseignants.
	 */
	public HashSet<Enseignant> enseignants = new HashSet<Enseignant>();
	
	/**
	 * Description of the property parcourss.
	 */
	public HashSet<Parcours> parcourss = new HashSet<Parcours>();
	
	/**
	 * Description of the property nom.
	 */
	public String nom = "";
	
	// Start of user code (user defined attributes for Departement)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public Departement() {
		// Start of user code constructor for Departement)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for Departement)
	
	// End of user code
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
