package utils;

public class Hour {
	private int heures;
	private int minutes;
	private TypeEnseignement type;
	
	public Hour(int heures, int minutes, TypeEnseignement type){
		this.heures = heures;
		this.minutes = minutes;
		this.type = type;
	}
	
	public int getHeure(){
		return this.heures;
	}
	
	public int getMinutes(){
		return this.minutes;
	}
	
	public TypeEnseignement getTypeEnseignement(){
		return this.type;
	}
	
	public Hour convertToHoursTD(){
		if(this.type == TypeEnseignement.TD){
			return this;
		}else if(this.type == TypeEnseignement.CM){
			int min = 60 * this.heures + this.minutes;
			int newmin = min * 3/2;
			int newheures = newmin / 60;
			int newminutes = newmin % 60;
			return new Hour(newheures,newminutes,TypeEnseignement.CM);
		}else if(this.type == TypeEnseignement.TP){
			int totmin = 60*this.heures + this.minutes;
			int newtotmin = totmin * 2/3;
			int newheures = newtotmin/60;
			int newmin = newtotmin % 60;
			return new Hour(newheures,newmin,TypeEnseignement.TP);
		}
		else return null;
	}
	
	public Hour convertToHoursTP(){
		if(this.type == TypeEnseignement.TP){
			return this;
		}else if(this.type == TypeEnseignement.TD){
			int min = 60 * this.heures + this.minutes;
			int newmin = min * 3/2;
			int newheures = newmin / 60;
			int newminutes = newmin % 60;
			return new Hour(newheures,newminutes,TypeEnseignement.TD);
		}else if(this.type == TypeEnseignement.CM){
			int totmin = 60*this.heures + this.minutes;
			int newtotmin = totmin * 9/4;
			int newheures = newtotmin/60;
			int newmin = newtotmin % 60;
			return new Hour(newheures,newmin,TypeEnseignement.CM);
		}
		else return null;
	}
	
	public Hour convertToHoursCM(){
		if(this.type == TypeEnseignement.CM){
			return this;
		}else if(this.type == TypeEnseignement.TD){
			int min = 60 * this.heures + this.minutes;
			int newmin = min * 2/3;
			int newheures = newmin / 60;
			int newminutes = newmin % 60;
			return new Hour(newheures,newminutes,TypeEnseignement.TD);
		}else if(this.type == TypeEnseignement.TP){
			int totmin = 60*this.heures + this.minutes;
			int newtotmin = totmin * 4/9;
			int newheures = newtotmin/60;
			int newmin = newtotmin % 60;
			return new Hour(newheures,newmin,TypeEnseignement.TP);
		}
		else return null;
	}

}
