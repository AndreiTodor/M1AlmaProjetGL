package source;
import java.util.HashSet;

/**
 * Classe définissant un service.
 */
public class Service {
	public Integer annee = Integer.valueOf(0);
	public HashSet<Intervention> interventions = new HashSet<Intervention>();
	public HashSet<Enseignant> enseignants = new HashSet<Enseignant>();
	public Integer volume = Integer.valueOf(0);
	
	/**
	 * The constructor.
	 */
	public Service() {
		super();
	}
	
	/**
	 * Returns annee.
	 * @return annee 
	 */
	public Integer getAnnee() {
		return this.annee;
	}
	
	/**
	 * Sets a value to attribute annee. 
	 * @param newAnnee 
	 */
	public void setAnnee(Integer newAnnee) {
	    this.annee = newAnnee;
	}

	/**
	 * Returns interventions.
	 * @return interventions 
	 */
	public HashSet<Intervention> getInterventions() {
		return this.interventions;
	}

	/**
	 * Returns enseignants.
	 * @return enseignants 
	 */
	public HashSet<Enseignant> getEnseignants() {
		return this.enseignants;
	}

	/**
	 * Returns volume.
	 * @return volume 
	 */
	public Integer getVolume() {
		return this.volume;
	}
	
	/**
	 * Sets a value to attribute volume. 
	 * @param newVolume 
	 */
	public void setVolume(Integer newVolume) {
	    this.volume = newVolume;
	}



}
