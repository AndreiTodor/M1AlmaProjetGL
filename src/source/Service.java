package source;
import java.util.HashSet;

/**
 * Description of Service.
 * 
 * @author andrei
 */
public class Service {
	/**
	 * Description of the property annee.
	 */
	public Integer annee = Integer.valueOf(0);
	
	/**
	 * Description of the property interventions.
	 */
	public HashSet<Intervention> interventions = new HashSet<Intervention>();
	
	/**
	 * Description of the property enseignants.
	 */
	public HashSet<Enseignant> enseignants = new HashSet<Enseignant>();
	
	/**
	 * Description of the property volume.
	 */
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
