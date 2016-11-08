package source;

/**
 * Description of Intervention.
 * 
 * @author andrei
 */
public abstract class Intervention {
	/**
	 * Description of the property service.
	 */
	public Service service = null;
	
	/**
	 * Description of the property volume.
	 */
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
