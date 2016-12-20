package persistanceEnseignant;

import utils.Enseignant;
import utils.Enseignement;
import utils.ListDemandes;

import java.util.List;

import utils.Demande;

public interface IPersistanceEnseignant {
	
	void ajoutVoeuBase(Enseignant enseignant, Enseignement e, int p, int h);
	
	void ajoutDemExtBase(Enseignant ens, String org, int vol);
	
	void ajoutDemSpecBase(Enseignant ens, String t, int vol);
	
	List<ListDemandes> getDemandes();
	
	void majListAttente(ListDemandes list);
	
	ListDemandes getListAttente();
	
	void moveFromAttenteToPublies();
	
	
	
	
	
	

}
