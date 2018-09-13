package TestCases;

import static org.junit.Assert.*;
import org.junit.Test;
import Model.*;

public class ModelTest extends TestCase{

	private Player player;
	private Weapon[] weap;

	
	public void allWeapons() {
		
		weap = new Weapon[5];
		weap[0] = new Weapon("100","5","AK-47");
		weap[1] = new Weapon("100","7","Fusil");
		weap[2] = new Weapon("100","11","Escopeta");
		weap[3] = new Weapon("100","4","Escopeta");
		weap[4] = new Weapon("100","9","Lanzallamas");
		
	}
	
	public void stageOne(){
		
		allWeapons();
		player = new Player("123","2","Santiago",2.9,"Android");
		
		for(int i =0; i<weap.length;i++){
			
			player.insertWeaponHash(weap[i].getKey(),weap[i].getBullets(),weap[i].getName());
		}
		
	}
	
	@Test
	public void SceneOne() {
		
		assertTrue(true);
		allWeapons();
		
		stageOne();
		System.out.println(player.getWeapons());
		System.out.println("The last weapon is: " + player.getTop().getKey() + " with: " +
		player.getTop().getBullets() + " bullets.");
		System.out.println("The last weapon is: " + player.pop().getKey() + " with: " +
				player.pop().getBullets() + " bullets.");
		
	}
	
	@Test
	public void SceneTwo() {
		
	}
	
	

}
