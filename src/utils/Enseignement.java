package source;
import java.util.HashSet;

/**
 * Classe définissant un enseignement.
 */
public abstract class Enseignement {

	public HashSet<Voeu> voeux = new HashSet<Voeu>();
	public TypeEnseignement type = null;
	public Hour volume = null;
	
	/**
	 * The constructor.
	 */
	public Enseignement() {
		super();
	}
	
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
