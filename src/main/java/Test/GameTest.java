package Test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import interfaces.IHashTable;
import junit.framework.TestCase;
import model.Game;
import model.Gun;
import model.Player;

public class GameTest extends TestCase{

	private Player player;
	private Game game;

	void stageOne() {
		
		player = new Player("Mark", "Xbox", 34, new Gun("sun", 21));
		game = new Game(player);
		
	}
	@Test
	public void testPosition() {
		
		stageOne();
		
		int posActual = game.position(player);
		
		assertTrue(posActual == game.position(player));
		
	}
	@Test
	public void testGetPlayer() {
		
		stageOne();
		
		assertEquals(game.getPlayer(), player);
	}

	@Test
	public void testSetPlayer() {
		
		stageOne();
		
		Player other = new Player("Andrew", "Xbox", 21, null);
		
		game.setPlayer(other);
		
		assertEquals(game.getPlayer(), other);
	}
	@Test
	public void testGunName() {
		
		stageOne();
		
		String gunActual = player.nameFirstGun();
		
		String gunExpected = game.gunName();
		
		assertEquals(gunExpected, gunActual);
	}
	
	@Test
	public void testBullets() {
		
		stageOne();
		
		int bulletsActual = player.bulletsFirstGun();
		
		int bulletsExpected = game.bullets();
		
		assertTrue(bulletsActual == bulletsExpected);
	}
	
	@Test
	public void testDeleteGun() {
		
		stageOne();
		
		game.deleteGun();
		
		assertEquals(game.gunName(), null);
	
	}
}
