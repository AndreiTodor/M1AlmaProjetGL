package source;
import java.util.HashSet;

/**
 * Description of Module.
 */
public class Module {
	/**
	 * Description of the property enseignements.
	 */
	public HashSet<Enseignement> enseignements = new HashSet<Enseignement>();
	
	/**
	 * The constructor.
	 */
	public Module() {
		super();
	}
	
	/**
	 * Returns enseignements.
	 * @return enseignements 
	 */
	public HashSet<Enseignement> getEnseignements() {
		return this.enseignements;
	}

}
