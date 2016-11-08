package source;

/**
 * Description of Demande Intervention Exterieure.
 */
public class DemandeInterventionExterieure extends Demande {
	/**
	 * Description of the property organisation.
	 */
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
