package source;
/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/


// Start of user code (user defined imports)

// End of user code

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
	
	// Start of user code (user defined attributes for Intervention)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public Intervention() {
		// Start of user code constructor for Intervention)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for Intervention)
	
	// End of user code
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
