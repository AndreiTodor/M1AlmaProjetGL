package source;

public class ChefDepartement extends Enseignant {
	private Departement departement;
	
	public ChefDepartement(String nom, String prenom, Departement departement) {
		super(nom, prenom);
		this.departement = departement;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	
	
}
