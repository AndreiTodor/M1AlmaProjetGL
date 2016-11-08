package source;
import java.util.HashSet;

/**
 * Classe définissant un voeu.
 */
public class Voeu extends Demande {
	public HashSet<InterventionAuDepartement> interventionAuDepartements = new HashSet<InterventionAuDepartement>();
	public Integer preference = Integer.valueOf(0);
	public Enseignement enseignement = null;
	
	/**
	 * The constructor.
	 */
	public Voeu() {
		super();
	}
	
	/**
	 * Returns intervention au Departements.
	 * @return intervention au Departements 
	 */
	public HashSet<InterventionAuDepartement> getInterventionAuDepartements() {
		return this.interventionAuDepartements;
	}

	/**
	 * Returns preference.
	 * @return preference 
	 */
	public Integer getPreference() {
		return this.preference;
	}
	
	/**
	 * Sets a value to attribute preference. 
	 * @param newPreference 
	 */
	public void setPreference(Integer newPreference) {
	    this.preference = newPreference;
	}

	/**
	 * Returns enseignement.
	 * @return enseignement 
	 */
	public Enseignement getEnseignement() {
		return this.enseignement;
	}
	
	/**
	 * Sets a value to attribute enseignement. 
	 * @param newEnseignement 
	 */
	public void setEnseignement(Enseignement newEnseignement) {
	    this.enseignement = newEnseignement;
	}



}
