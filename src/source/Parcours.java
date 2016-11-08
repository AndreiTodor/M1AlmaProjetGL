package source;
import java.util.HashSet;

/**
 * Classe définissant un parcours.
 */
public class Parcours {
	public HashSet<Module> modules = new HashSet<Module>();
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
