package utils;
import java.util.HashSet;

/**
 * Classe d�finissant un voeu.
 */
public class Voeu extends Demande {
	private HashSet<InterventionAuDepartement> interventionAuDepartements = new HashSet<InterventionAuDepartement>();
	private Integer preference = Integer.valueOf(0);
	private Enseignement enseignement = null;
	
	/**
	 * The constructor.
	 */
	public Voeu(Enseignant e, Hour h, int pref, Enseignement ens) {
		super(e, h);
		this.preference = pref;
		this.enseignement = ens;
	}
	
	/**
	 * Returns intervention au Departements.
	 * @return intervention au Departements 
	 */
	public HashSet<InterventionAuDepartement> getInterventionAuDepartements() {
		return this.interventionAuDepartements;
	}
	
	protected void addIntervention(InterventionAuDepartement intervention){
		this.interventionAuDepartements.add(intervention);
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
	protected void setPreference(Integer newPreference) {
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
	protected void setEnseignement(Enseignement newEnseignement) {
	    this.enseignement = newEnseignement;
	}



}
