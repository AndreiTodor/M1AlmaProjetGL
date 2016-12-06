package source;
import java.util.HashSet;

/**
 * Classe definissant un enseignant.
 */
public class Enseignant {

	private String prenom;
	private String nom;
	
	private String statut;
	private Contrat contrat;
	
	private HashSet<Demande> demandes = new HashSet<Demande>();
	private HashSet<Service> services = new HashSet<Service>();
	
	/**
	 * The constructor.
	 */
	public Enseignant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
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
	protected void setStatut(String newStatut) {
	    this.statut = newStatut;
	}

	/**
	 * Returns demandes.
	 * @return demandes 
	 */
	public HashSet<Demande> getDemandes() {
		return this.demandes;
	}
	protected void addDemande(Demande demande){
		this.demandes.add(demande);
	}

	protected void emettreDemandeSpeciale(Enseignant e, Hour h){
		this.addDemande(new DemandeSpeciale(e, h));
	}
	protected void emettreDemandeInterventionExterieur(Enseignant e, Hour h, String org){
		this.addDemande(new DemandeInterventionExterieure(e, h, org));
	}
	protected void emettreVoeu(Enseignant e, Hour h, int pref, Enseignement ens){
		this.addDemande(new Voeu(e, h, pref, ens));
	}
	
	protected void publierSouhaits(){
		for (Demande demande : demandes) {
			demande.publish();
		}
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
	protected void setPrenom(String newPrenom) {
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
	protected void setContrat(Contrat newContrat) {
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
	protected void setNom(String newNom) {
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
