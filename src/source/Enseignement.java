package source;
import java.util.HashSet;

/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/


// Start of user code (user defined imports)

// End of user code

/**
 * Description of Enseignement.
 * 
 * @author andrei
 */
public abstract class Enseignement {
	/**
	 * Description of the property voeux.
	 */
	public HashSet<Voeu> voeux = new HashSet<Voeu>();
	
	/**
	 * Description of the property type.
	 */
	public TypeEnseignement type = null;
	
	/**
	 * Description of the property volume.
	 */
	public Hour volume = null;
	
	// Start of user code (user defined attributes for Enseignement)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public Enseignement() {
		// Start of user code constructor for Enseignement)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for Enseignement)
	
	// End of user code
	/**
	 * Returns voeux.
	 * @return voeux 
	 */
	public HashSet<Voeu> getVoeux() {
		return this.voeux;
	}

	/**
	 * Returns type.
	 * @return type 
	 */
	public TypeEnseignement getType() {
		return this.type;
	}
	
	/**
	 * Sets a value to attribute type. 
	 * @param newType 
	 */
	public void setType(TypeEnseignement newType) {
	    this.type = newType;
	}

	/**
	 * Returns volume.
	 * @return volume 
	 */
	public Hour getVolume() {
		return this.volume;
	}
	
	/**
	 * Sets a value to attribute volume. 
	 * @param newVolume 
	 */
	public void setVolume(Hour newVolume) {
	    this.volume = newVolume;
	}



}
