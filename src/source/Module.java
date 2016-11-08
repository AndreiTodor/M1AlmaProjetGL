package source;
import java.util.HashSet;

/**
 * Classe d�finissant un module Module.
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
