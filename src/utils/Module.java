package source;
import java.util.HashSet;

/**
 * Classe d�finissant un module Module.
 */
public class Module {

	private String nom;
	private HashSet<Enseignement> enseignements = new HashSet<Enseignement>();
	private Parcours parcours;
	
	/**
	 * The constructor.
	 */
	public Module(String nom, Parcours parcours) {
		this.setNom(nom);
		this.setParcours(parcours);
	}
	
	/**
	 * Returns enseignements.
	 * @return enseignements 
	 */
	public HashSet<Enseignement> getEnseignements() {
		return this.enseignements;
	}
	
	/**
	 * ajout d'un autre enseignement a la liste des enseignements 
	 * @param enseignement
	 */
	public void addEnseignement(Enseignement enseignement){
		this.enseignements.add(enseignement);
	}

	/**
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * changer le nom du module
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return parcours
	 */
	public Parcours getParcours() {
		return parcours;
	}

	/**
	 * changer le parcours auquel appartient ce module
	 * @param parcours
	 */
	public void setParcours(Parcours parcours) {
		this.parcours = parcours;
	}

}
