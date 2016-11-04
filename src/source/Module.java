package source;
import java.util.HashSet;

/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/


// Start of user code (user defined imports)

// End of user code

/**
 * Description of Module.
 * 
 * @author andrei
 */
public class Module {
	/**
	 * Description of the property enseignements.
	 */
	public HashSet<Enseignement> enseignements = new HashSet<Enseignement>();
	
	// Start of user code (user defined attributes for Module)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public Module() {
		// Start of user code constructor for Module)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for Module)
	
	// End of user code
	/**
	 * Returns enseignements.
	 * @return enseignements 
	 */
	public HashSet<Enseignement> getEnseignements() {
		return this.enseignements;
	}



}
