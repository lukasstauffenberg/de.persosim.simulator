package de.persosim.simulator.test.globaltester.perso;

import de.persosim.simulator.perso.Profile04;
import de.persosim.simulator.perso.Personalization;

public class DefaultPersoTestPkiTemplate04Test extends TestPersoTest {

	@Override
	public Personalization getPersonalization() {
		if(persoCache == null) {
			persoCache = new Profile04();
		}
		
		return persoCache;
	}
	
}
