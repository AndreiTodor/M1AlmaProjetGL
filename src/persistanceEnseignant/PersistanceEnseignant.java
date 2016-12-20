package persistanceEnseignant;

import java.util.List;

import utils.Enseignant;
import utils.Enseignement;
import utils.ListDemandes;

public class PersistanceEnseignant implements IPersistanceEnseignant {
	
	public PersistanceEnseignant(){
		
	}

	public void ajoutVoeuBase(Enseignant enseignant, Enseignement e, int p, int h) {

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

	@Override
	public ListDemandes getListAttente() {
		return null;
	}

	public void moveFromAttenteToPublies() {

	}

}
