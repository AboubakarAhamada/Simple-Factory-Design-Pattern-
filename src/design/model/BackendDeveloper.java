/**
 * 
 */
package design.model;

/**
 * @author Aboubakar
 *
 */
public class BackendDeveloper extends Developer {
	
	private String programmingLanagage;
	private String framework;
	
    // Add a constructor:
	
	/**
	 * @param programmingLanagage
	 * @param framework
	 */
	public BackendDeveloper(String programmingLanagage, String framework) {
		super();
		this.programmingLanagage = programmingLanagage;
		this.framework = framework;
	}
	
	// Here we implement Developer class methods :
	
	@Override
	public String getProgrammingLangage() {
		return this.programmingLanagage;
	}
	
	@Override
	public String getFramework() {
		return this.framework;
	}
	
	

}
