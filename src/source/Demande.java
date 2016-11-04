package source;
/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/


// Start of user code (user defined imports)

// End of user code

/**
 * Description of Demande.
 * 
 * @author andrei
 */
public abstract class Demande {
	/**
	 * Description of the property enseignant.
	 */
	public Enseignant enseignant = null;
	
	/**
	 * Description of the property heures.
	 */
	public Hour heures = null;
	
	/**
	 * Description of the property publié.
	 */
	public Boolean publié = Boolean.FALSE;
	
	// Start of user code (user defined attributes for Demande)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public Demande() {
		// Start of user code constructor for Demande)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for Demande)
	
	// End of user code
	/**
	 * Returns enseignant.
	 * @return enseignant 
	 */
	public Enseignant getEnseignant() {
		return this.enseignant;
	}
	
	/**
	 * Sets a value to attribute enseignant. 
	 * @param newEnseignant 
	 */
	public void setEnseignant(Enseignant newEnseignant) {
	    this.enseignant = newEnseignant;
	}

	/**
	 * Returns heures.
	 * @return heures 
	 */
	public Hour getHeures() {
		return this.heures;
	}
	
	/**
	 * Sets a value to attribute heures. 
	 * @param newHeures 
	 */
	public void setHeures(Hour newHeures) {
	    this.heures = newHeures;
	}

	/**
	 * Returns publié.
	 * @return publié 
	 */
	public Boolean getPublié() {
		return this.publié;
	}
	
	/**
	 * Sets a value to attribute publié. 
	 * @param newPublié 
	 */
	public void setPublié(Boolean newPublié) {
	    this.publié = newPublié;
	}



}
