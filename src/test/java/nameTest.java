package test.java;

import java.util.List;

import main.java.monsterpok.pkgMon.Attack;
import main.java.monsterpok.pkgMon.Type;
import monsterpok.pkgMon.Dragon;
import monsterpok.pkgMon.Monster;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class nameTest {

	public nameTest() {
        Monster dragon = new Dragon();
        assertEquals("dragon",dragon.getName());
        assertThat(dragon.getName(), is(not("dragon1")));
	}

}
	