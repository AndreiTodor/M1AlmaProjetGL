package utils;

/**
 * Classe abstraite d�finissant un intervention.
 */
public abstract class Intervention {

	public Service service = null;
	public String volume = "";
	
	/**
	 * The constructor.
	 */
	public Intervention() {
		super();
	}
	
	/**
	 * Returns service.
	 * @return service 
	 */
	public Service getService() {
		return this.service;
	}
	
	/**
	 * Sets a value to attribute service. 
	 * @param newService 
	 */
	public void setService(Service newService) {
	    this.service = newService;
	}

	/**
	 * Returns volume.
	 * @return volume 
	 */
	public String getVolume() {
		return this.volume;
	}
	
	/**
	 * Sets a value to attribute volume. 
	 * @param newVolume 
	 */
	public void setVolume(String newVolume) {
	    this.volume = newVolume;
	}



}
