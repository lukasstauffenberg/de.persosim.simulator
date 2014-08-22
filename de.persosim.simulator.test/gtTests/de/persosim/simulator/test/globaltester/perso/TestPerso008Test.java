package de.persosim.simulator.test.globaltester.perso;

import de.persosim.simulator.perso.DefaultPersoTestPkiTemplate08;
import de.persosim.simulator.perso.Personalization;

public class TestPerso008Test extends TestPersoTest {

	@Override
	public Personalization getPersonalization() {
		if(persoCache == null) {
			persoCache = new DefaultPersoTestPkiTemplate08();
		}
		
		return persoCache;
	}
	
}
