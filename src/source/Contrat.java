package source;
import java.util.HashSet;

/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/


// Start of user code (user defined imports)

// End of user code

/**
 * Description of Contrat.
 * 
 * @author andrei
 */
public class Contrat {
	/**
	 * Description of the property min.
	 */
	public Hour min = null;
	
	/**
	 * Description of the property max.
	 */
	public Hour max = null;
	
	/**
	 * Description of the property enseignants.
	 */
	public HashSet<Enseignant> enseignants = new HashSet<Enseignant>();
	
	// Start of user code (user defined attributes for Contrat)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public Contrat() {
		// Start of user code constructor for Contrat)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for Contrat)
	
	// End of user code
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
