package TestCases;

import org.junit.Test;

import Model.Player;
import Model.Ranking;

import static org.junit.Assert.*;

public class RankingTest {
	
	
	private Ranking ranking;
	
	
	public void stage() {
		
		ranking = new Ranking(); 
	}
	
	@Test
	public void sceneOne() {
		stage();
		Player p1 = new Player("Santiago1", "0001", "Xbox", 0);
		Player p2 = new Player("Santiago2", "0002", "PSP4", 1);
		Player p3 = new Player("Santiago3", "0003", "Windos", 34);
		Player p4 = new Player("Santiago4", "0005", "Xbox", 100);
		Player p5 = new Player("Santiago5", "0004", "MacOs", 3);
		Player p6 = new Player("Santiago6", "0006", "Android", 56);
		
		ranking.insertStak(p1);
		ranking.insertStak(p2);
		ranking.insertStak(p3);
		ranking.insertStak(p4);
		ranking.insertStak(p5);
		ranking.insertStak(p6);
		
		assertEquals(6,ranking.longitude());
	}
	
	@Test
	public void sceneTwo() {
		stage();
		
		Player p1 = new Player("Santiago1", "0001", "Xbox", 0);
		Player p2 = new Player("Santiago2", "0002", "PSP4", 1);
		Player p3 = new Player("Santiago3", "0003", "Windos", 34);
		
		ranking.insertStak(p1);
		ranking.insertStak(p2);
		ranking.insertStak(p3);
		
		ranking.remove("Santiago1");
		
		assertEquals(2,ranking.longitude());
		
	}
	
	@Test
	public void sceneThree() {
		stage();
		
		Player p1 = new Player("Santiago1", "0001", "Xbox", 0);
		Player p2 = new Player("Santiago2", "0002", "PSP4", 1);
		Player p3 = new Player("Santiago3", "0003", "Windos", 34);
		Player p4 = new Player("Santiago4", "0005", "Xbox", 100);
		
		ranking.insertStak(p1);
		ranking.insertStak(p2);
		ranking.insertStak(p3);
		ranking.insertStak(p4);
		
		assertEquals(p2,ranking.search("Santiago2"));
	}
	
	

}
