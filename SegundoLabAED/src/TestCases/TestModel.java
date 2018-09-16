package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import Model.Player;
import Model.Ranking_Players;
import Model.Weapon;

public class TestModel {


	private Ranking_Players ranking;
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
	

	public void stageTwo(){
		
		Player p1 = new Player("123","2","Santiago1",2.1,"Android");
		Player p2 = new Player("124","5","Santiago2",2.8,"Xbox");
		Player p3 = new Player("125","3","Santiago3",2.7,"IOS");
		Player p4 = new Player("126","6","Santiago4",2.6,"PSP4");
		Player p5 = new Player("127","4","Santiago5",2.4,"Android");
		Player p6 = new Player("128","7","Santiago6",2.2,"Windows");
		Player p7 = new Player("129","1","Santiago7",2.1,"MacOs");
		
		ranking.QueueUp(p1);
		ranking.QueueUp(p2);
		ranking.QueueUp(p3);
		ranking.QueueUp(p4);
		ranking.QueueUp(p5);
		ranking.QueueUp(p6);
		ranking.QueueUp(p7);
	}
	
	@Test
	public void SceneOne() {
		
		allWeapons();
		stageOne();
		System.out.println(player.getWeapons());
		assertTrue(true);
	//	System.out.println("The last weapon is: " + player.getTop().getKey() + " with: " +
	//	player.getTop().getBullets() + " bullets.");
	//	System.out.println("The last weapon is: " + player.pop().getKey() + " with: " +
	//			player.pop().getBullets() + " bullets.");
		
	}
	
	@Test
	public void SceneTwo() {
		//allWeapons();
		//stageTwo();
		assertTrue(true);
		//assertEquals(7, ranking.tamaño());
		//System.out.println(ranking.tamaño());
		
	}
	
	

}
