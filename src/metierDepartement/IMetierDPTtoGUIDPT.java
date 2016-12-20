package metierDepartement;

import java.util.ArrayList;

import utils.Demande;
import utils.Enseignant;
import utils.Enseignement;
import utils.EnumCriteres;
import utils.Module;
import utils.Voeu;

public interface IMetierDPTtoGUIDPT {
	public void analyserLesDemandes(int annee, EnumCriteres choix);
	public void selectionDemandeEtValidation(ArrayList<Demande> liste);
	public void selectionDemandeEtAffectatiton(ArrayList<Demande> liste);
	public void affectationForcee(Voeu v);

}
