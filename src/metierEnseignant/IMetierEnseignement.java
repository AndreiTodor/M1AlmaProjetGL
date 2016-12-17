package metierEnseignant;

import java.util.ArrayList;

import utils.Demande;
import utils.Enseignant;
import utils.Enseignement;
import utils.Module;

public interface IMetierEnseignement {
	public void emettreVoeu(Enseignant ens, Module m, Enseignement e, int h, int p);
	public void emettreDemExt(Enseignant ens, String org, int vol);
	public void emettreDemSpec(Enseignant ens, String t, int vol);
	public void afficherDemandes();
	public void selectionnerSouhaits(ArrayList<Demande> liste);
	public void publierSouhaits();
	public void consulter();
}
