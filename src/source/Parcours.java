package source;
import java.util.HashSet;

/**
 * Description of Parcours.
 * 
 * @author andrei
 */
public class Parcours {
	/**
	 * Description of the property modules.
	 */
	public HashSet<Module> modules = new HashSet<Module>();
	
	/**
	 * The constructor.
	 */
	public Parcours() {
		super();
	}
	
	/**
	 * Returns modules.
	 * @return modules 
	 */
	public HashSet<Module> getModules() {
		return this.modules;
	}



}
