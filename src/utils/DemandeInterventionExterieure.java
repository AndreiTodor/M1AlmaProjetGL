package utils;

/**
 * Classe d�finissant une demande d'intervention ext�rieure
 */
public class DemandeInterventionExterieure extends Demande {

	private String organisation = "";
	
	/**
	 * The constructor.
	 */
	public DemandeInterventionExterieure(Enseignant e, Hour h, String org) {
		super(e, h);
		this.organisation = org;
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
	protected void setOrganisation(String newOrganisation) {
	    this.organisation = newOrganisation;
	}



}
