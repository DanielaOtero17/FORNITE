package TestCases;

import static org.junit.Assert.*;
import org.junit.Test;
import Model.*;

public class ModelTest {

	private Player player;
	private Weapon[] weap;

	
	public void allWeapons() {
		
		weap = new Weapon[5];
		weap[0] = new Weapon("AK-47","5");
		weap[1] = new Weapon("Fusil","7");
		weap[2] = new Weapon("Escopeta","11");
		weap[3] = new Weapon("Escopeta","4");
		weap[4] = new Weapon("Lanzallamas","9");
		
	}
	
	public void stageOne(){
		
		allWeapons();
		player = new Player("Santiago","2",2.9,"Android");
		
		for(int i =0; i<4;i++){
			
			player.insertWeaponHash(weap[i].getKey(),weap[i].getBullets());
		}
		
	}
	@Test
	public void testOne() {
		
		allWeapons();
		stageOne();
		System.out.println(player.getWeapons());
		System.out.println("The last weapon is: " + player.getTop().getKey() + " with: " +
		player.getTop().getBullets() + " bullets.");
		player.remove(weap[3]);
		System.out.println(player.getWeapons());
		assertTrue(true);
		
	}
	
	

}
