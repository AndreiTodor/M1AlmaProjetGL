package source;
import java.util.HashSet;

/**
 * Classe d�finissant un parcours.
 */
public class Parcours {
	private Departement departement; 
	private HashSet<Module> modules = new HashSet<Module>();
	private String nom;
	
	public Parcours(String nom,Departement departement) {
		this.setNom(nom);
		this.departement = departement;
	}
	
	/**
	 * Returns modules.
	 * @return modules 
	 */
	public HashSet<Module> getModules() {
		return this.modules;
	}

	/**
	 * ajoute une liste complete des modules a cet parcours
	 * @param modules
	 */
	public void setModules(HashSet<Module> modules) {
		this.modules = modules;
	}

	/**
	 * 
	 * @return departement
	 */
	public Departement getDepartement() {
		return departement;
	}
	
	/**
	 * ajute a la liste des modules un nouveau module
	 * @param module
	 */
	public void addModule(Module module){
		this.modules.add(module);
	}

	/**
	 * 
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * changer le nom du parcours
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	



}
