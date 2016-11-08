package source;

/**
 * Classe définissant une intervention au departement.
 */
public class InterventionAuDepartement extends Intervention {
	/**
	 * Description of the property voeu.
	 */
	public Voeu voeu = null;
	
	/**
	 * The constructor.
	 */
	public InterventionAuDepartement() {
		super();
	}
	
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
