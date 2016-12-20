package persistanceDepartement;

import java.util.List;

import utils.Enseignant;
import utils.Enseignement;
import utils.EnumCriteres;
import utils.Intervention;
import utils.ListDemandes;
import utils.Module;

public interface IPersistanceDepartement {
	
	void ajoutVoeuxBase(Enseignant enseignant,Module module, Enseignement e, int h, int p);
	
	void ajoutDemExtBase(Enseignant ens, String org, int vol);
	
	void ajoutDemSpecBase(Enseignant ens, String t, int vol);
	
	List<ListDemandes> getDemandes();
	
	void majListAttente(ListDemandes list);
	
	ListDemandes getListAttente();
	
	void moveEnAttenteToPublies();
	
	void ajoutListPublie(ListDemandes listAttente);
	
	ListDemandes getListDemande(int annee, EnumCriteres choix);
	
	void majListInterventions(String status,List<Intervention> listInterventions);
	
	void checkAndMaj();
	
	void majListeDemandeValidees(ListDemandes listDemandes);

}
