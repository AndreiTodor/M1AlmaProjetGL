package utils;

import java.util.List;

public class ListDemandes {
	private String listStatus;//description du type d'elements dans la liste(ex: publié, émis)
	private List<Demande> list;
	
	
	public ListDemandes(String listStatus){
		this.listStatus = listStatus;
	}
	
	public List<Demande> getListDemandes(){
		return list;
	}
	
	public void add(Demande dem){
		this.list.add(dem);
	}
	
	public boolean remove(Demande dem){
		return this.list.remove(dem);
	}
}
