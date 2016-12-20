package metierDepartement;

import java.util.ArrayList;

import utils.Demande;
import utils.Enseignant;
import utils.Enseignement;
import utils.Module;
import utils.Voeu;

public interface IMetierDPTtoMetierEns {
	public void restCo();
	public void maJ();
	public void publierDemande(ArrayList<Demande> listeEnAtt);

}
