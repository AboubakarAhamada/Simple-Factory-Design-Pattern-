/**
 * 
 */
package design.model;

/**
 * @author Aboubakar
 *
 */
public class FrontendDeveloper extends Developer {
	
	private  String programmingLangage;
	private  String framework;
	/**
	 * @param programmingLangage
	 * @param framework
	 */
	public FrontendDeveloper(String programmingLangage, String framework) {
		super();
		this.programmingLangage = programmingLangage;
		this.framework = framework;
	}
	@Override
	public String getProgrammingLangage() {
		return this.programmingLangage;
	}
	@Override
	public String getFramework() {
		return this.framework;
	}
	
	

}
