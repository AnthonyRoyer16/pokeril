package test.java;

public class healTest {

	public healTest() {
        Monster dragon = new Dragon();
        assertEquals(50,dragon.useAtt(dragon,-10));
	}

}
