package source;
import java.util.HashSet;

/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/


// Start of user code (user defined imports)

// End of user code

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
	
	// Start of user code (user defined attributes for Service)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public Service() {
		// Start of user code constructor for Service)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for Service)
	
	// End of user code
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
