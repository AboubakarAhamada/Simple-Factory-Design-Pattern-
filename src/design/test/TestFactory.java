/**
 * 
 */
package design.test;

import design.model.Developer;
import design.factory.DeveloperFactory;

/**
 * @author Aboubakar
 *
 */
public class TestFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Developer backendDeveloper = DeveloperFactory.getDeveloperFactory("BackEnd",
				"Java, C#", "Spring boot, Asp.Net");
		
		Developer frontendDeveloper = DeveloperFactory.getDeveloperFactory("frontend", 
				" JavaScript", "React, Bootstrap");
		
		System.out.println("I am a Back-end Developer : "+backendDeveloper.toString());
		System.out.println("I am a Front-end Developer : "+frontendDeveloper.toString());
		

	}

}
