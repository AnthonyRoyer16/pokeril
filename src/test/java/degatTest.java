package test.java;

import monsterpok.pkgMon.Dauphin;
import monsterpok.pkgMon.Dragon;
import monsterpok.pkgMon.Monster;

public class degatTest {

	public degatTest() {
        Monster dauphin = new Dauphin();
        Monster dragon = new Dragon();
        
        assertEquals(25, dauphin.getPV());
        assertEquals(40, dragon.getPV());
        
        assertEquals(10,dragon.useAtt(dauphin,15));
	}

}
