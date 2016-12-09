package utils;
import java.util.HashSet;

/**
 * Classe definissant un departement.
 */
public class Departement {
	private ChefDepartement responsable;
	private HashSet<Enseignant> enseignants = new HashSet<Enseignant>();
	private HashSet<Parcours> parcours = new HashSet<Parcours>();
	private String nom;
	
	/**
	 * The constructor.
	 */
	public Departement(ChefDepartement responsable, String nom) {
		this.responsable = responsable;
		this.nom = nom;
	}
	
	/**
	 * Returns enseignants.
	 * @return enseignants 
	 */
	public HashSet<Enseignant> getEnseignants() {
		return this.enseignants;
	}

	/**
	 * Returns parcourss.
	 * @return parcourss 
	 */
	public HashSet<Parcours> getParcourss() {
		return this.parcours;
	}

	/**
	 * Returns nom.
	 * @return nom 
	 */
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * Sets a value to attribute nom. 
	 * @param newNom 
	 */
	public void setNom(String newNom) {
	    this.nom = newNom;
	}

	/**
	 * Returns responsable.
	 * @return responsable 
	 */
	public Enseignant getResponsable() {
		return this.responsable;
	}
	
	/**
	 * Sets a value to attribute nom. 
	 * @param newNom 
	 */
	public void setResponsable(ChefDepartement newResponsable) {
	    this.responsable = newResponsable;
	}
	
	/**
	 * Ajout d'un nouveau enseignant
	 * @param enseignant
	 */
	public void addEnseignant(Enseignant enseignant){
		this.enseignants.add(enseignant);
	}
	
	/**
	 * Ajout d'un nouveau Parcours
	 * @param parcours
	 */
	public void addParcours(Parcours parcours){
		this.parcours.add(parcours);
	}

}
