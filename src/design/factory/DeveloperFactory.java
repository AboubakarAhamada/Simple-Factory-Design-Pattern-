/**
 * 
 */
package design.factory;

import design.model.Developer;
import design.model.BackendDeveloper;
import design.model.FrontendDeveloper;

/**
 * @author Aboubakar
 *
 */
public class DeveloperFactory {
	
	/* 
	 * In this class, we write a static method who  returns Developer object :
	 * (1) BackendDeveloper object if type equals BackEnd
	 * (2) FrontEndDeveloper object if typer equals FrontEnd
	 */
	
	public static Developer getDeveloperFactory(String type, String programmingLangage, String framework) {
		
		if("BackEnd".equalsIgnoreCase(type)) {
			return new BackendDeveloper(programmingLangage, framework);
		}
		
		if("FrontEnd".equalsIgnoreCase(type)) {
			return new FrontendDeveloper(programmingLangage, framework);
		}
		
		return null;
	}

}
