package source;
/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/


// Start of user code (user defined imports)

// End of user code

/**
 * Description of Intervention au Departement.
 * 
 * @author andrei
 */
public class InterventionAuDepartement extends Intervention {
	/**
	 * Description of the property voeu.
	 */
	public Voeu voeu = null;
	
	// Start of user code (user defined attributes for Intervention au Departement)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public InterventionAuDepartement() {
		// Start of user code constructor for Intervention au Departement)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for Intervention au Departement)
	
	// End of user code
	/**
	 * Returns voeu.
	 * @return voeu 
	 */
	public Voeu getVoeu() {
		return this.voeu;
	}
	
	/**
	 * Sets a value to attribute voeu. 
	 * @param newVoeu 
	 */
	public void setVoeu(Voeu newVoeu) {
	    this.voeu = newVoeu;
	}



}
