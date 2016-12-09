package source;
import java.util.HashSet;


/**
 * Classe définissant un contrat
 */
public class Contrat {
	
	public Hour min = null;
	public Hour max = null;
	public HashSet<Enseignant> enseignants = new HashSet<Enseignant>();
	
	/**
	 * The constructor.
	 */
	public Contrat() {
		super();
	}
	
	/**
	 * Returns min.
	 * @return min 
	 */
	public Hour getMin() {
		return this.min;
	}
	
	/**
	 * Sets a value to attribute min. 
	 * @param newMin 
	 */
	public void setMin(Hour newMin) {
	    this.min = newMin;
	}

	/**
	 * Returns max.
	 * @return max 
	 */
	public Hour getMax() {
		return this.max;
	}
	
	/**
	 * Sets a value to attribute max. 
	 * @param newMax 
	 */
	public void setMax(Hour newMax) {
	    this.max = newMax;
	}

	/**
	 * Returns enseignants.
	 * @return enseignants 
	 */
	public HashSet<Enseignant> getEnseignants() {
		return this.enseignants;
	}



}
