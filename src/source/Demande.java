package source;

/**
 * Classe définissant une demande
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
	 * Description of the property published©.
	 */
	public Boolean published = Boolean.FALSE;
	
	/**
	 * The constructor.
	 */
	public Demande() {
		super();
	}
	
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
	 * Returns published
	 * @return published
	 */
	public Boolean getPublished() {
		return this.published;
	}
	
	/**
	 * Sets a value to attribute published. 
	 * @param newPublished 
	 */
	public void setPublished(Boolean newPublished) {
	    this.published = newPublished;
	}



}
