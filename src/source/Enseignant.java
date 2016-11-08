package source;
import java.util.HashSet;

/**
 * Description of Enseignant.
 */
public class Enseignant {
	/**
	 * Description of the property statut.
	 */
	public String statut = "";
	
	/**
	 * Description of the property demandes.
	 */
	public HashSet<Demande> demandes = new HashSet<Demande>();
	
	/**
	 * Description of the property prenom.
	 */
	public String prenom = "";
	
	/**
	 * Description of the property contrat.
	 */
	public Contrat contrat = null;
	
	/**
	 * Description of the property nom.
	 */
	public String nom = "";
	
	/**
	 * Description of the property services.
	 */
	public HashSet<Service> services = new HashSet<Service>();
	
	/**
	 * The constructor.
	 */
	public Enseignant() {
		super();
	}
	
	/**
	 * Returns statut.
	 * @return statut 
	 */
	public String getStatut() {
		return this.statut;
	}
	
	/**
	 * Sets a value to attribute statut. 
	 * @param newStatut 
	 */
	public void setStatut(String newStatut) {
	    this.statut = newStatut;
	}

	/**
	 * Returns demandes.
	 * @return demandes 
	 */
	public HashSet<Demande> getDemandes() {
		return this.demandes;
	}

	/**
	 * Returns prenom.
	 * @return prenom 
	 */
	public String getPrenom() {
		return this.prenom;
	}
	
	/**
	 * Sets a value to attribute prenom. 
	 * @param newPrenom 
	 */
	public void setPrenom(String newPrenom) {
	    this.prenom = newPrenom;
	}

	/**
	 * Returns contrat.
	 * @return contrat 
	 */
	public Contrat getContrat() {
		return this.contrat;
	}
	
	/**
	 * Sets a value to attribute contrat. 
	 * @param newContrat 
	 */
	public void setContrat(Contrat newContrat) {
	    this.contrat = newContrat;
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
	 * Returns services.
	 * @return services 
	 */
	public HashSet<Service> getServices() {
		return this.services;
	}



}
