package source;

/**
 * Classe définissant une demande d'intervention extérieure
 */
public class DemandeInterventionExterieure extends Demande {

	public String organisation = "";
	
	/**
	 * The constructor.
	 */
	public DemandeInterventionExterieure() {
		super();
	}
	
	/**
	 * Returns organisation.
	 * @return organisation 
	 */
	public String getOrganisation() {
		return this.organisation;
	}
	
	/**
	 * Sets a value to attribute organisation. 
	 * @param newOrganisation 
	 */
	public void setOrganisation(String newOrganisation) {
	    this.organisation = newOrganisation;
	}



}
