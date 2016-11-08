package source;
import java.util.HashSet;

/**
 * Classe d�finissant un parcours.
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
