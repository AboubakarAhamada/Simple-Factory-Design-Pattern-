/**
 * 
 */
package design.model;

/**
 * @author Aboubakar
 *
 */
public abstract class Developer {
	
	//private String programmingLanage; // Not used anymore, we can remove it
	//private String framework;			// Not used anymore, we don't need it.
	
	// In this class, we need to provide abstract getters methods for class's properties as follow :
	
	public abstract String getProgrammingLangage();
	public abstract String getFramework();
	
	public String toString() {
		return "Programming langage = " + this.getProgrammingLangage() + ", Framework= " + this.getFramework();
				
	}
	
	
	

}
