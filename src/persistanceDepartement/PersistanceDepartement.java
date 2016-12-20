package persistanceDepartement;

import java.util.List;

import utils.Enseignant;
import utils.Enseignement;
import utils.EnumCriteres;
import utils.Intervention;
import utils.ListDemandes;
import utils.Module;

public class PersistanceDepartement implements IPersistanceDepartement {

	public void ajoutVoeuxBase(Enseignant enseignant, Module module, Enseignement e, int h, int p) {

	}

	public void ajoutDemExtBase(Enseignant ens, String org, int vol) {

	}

	public void ajoutDemSpecBase(Enseignant ens, String t, int vol) {

	}

	public List<ListDemandes> getDemandes() {
		return null;
	}

	public void majListAttente(ListDemandes list) {

	}

	public ListDemandes getListAttente() {
		return null;
	}

	public void moveEnAttenteToPublies() {

	}

	public void ajoutListPublie(ListDemandes listAttente) {

	}

	public void majListInterventions(String status, List<Intervention> listInterventions) {

	}

	public void checkAndMaj() {

	}

	public void majListeDemandeValidees(ListDemandes listDemandes) {

	}

	public ListDemandes getListDemande(int annee, EnumCriteres choix) {
		return null;
	}

}
