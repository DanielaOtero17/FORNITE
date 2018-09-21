package TestCases;
import org.junit.Test;

import Model.Armory;
import Model.Player;
import Model.Ranking;
import Model.Weapon;

import static org.junit.Assert.*;

public class testTAD {
		
		
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
		
		private Armory armory;
		

		public void stage2() {
			
			armory = new Armory(); 
		}
		
		@Test
		public void sceneFour() {
			stage2();
			Weapon w1 = new Weapon("100","AK-47");
			Weapon w2 = new Weapon("150","Minigun");
			Weapon w3 = new Weapon("250","Pistola");
			Weapon w4 = new Weapon("240","Rifle");
			Weapon w5 = new Weapon("230","Escopeta");
			Weapon w6 = new Weapon("0","Hacha");
			
			armory.enQueue(w6);
			armory.enQueue(w2);
			armory.enQueue(w3);
			armory.enQueue(w4);
			armory.enQueue(w5);
			armory.enQueue(w1);
			
			assertEquals(6,armory.longitude());
		}
		
		@Test
		public void sceneFive() {
			stage2();
			
			Weapon w1 = new Weapon("0","Hacha");
			Weapon w2 = new Weapon("150","Minigun");
			Weapon w3 = new Weapon("250","Pistola");
			
			armory.enQueue(w1);
			armory.enQueue(w2);
			armory.enQueue(w3);
			
			Weapon w0 = armory.deQueue();
			
			assertEquals("Hacha",w0.getName());
		}
		
		
		@Test
		public void sceneSix() {
			stage2();
			
			Weapon w2 = new Weapon("150","Minigun");
			Weapon w3 = new Weapon("250","Pistola");
			Weapon w4 = new Weapon("240","Rifle");
			Weapon w5 = new Weapon("230","Escopeta");
			Weapon w6 = new Weapon("0","Hacha");
			
			armory.enQueue(w6);
			armory.enQueue(w2);
			armory.enQueue(w3);
			armory.enQueue(w4);
			armory.enQueue(w5);
			
			assertEquals(w3,armory.search("Pistola"));
			
		}
		
		@Test
		public void sceneSeven() {
			stage2();
			
			Weapon w1 = new Weapon("100","AK-47");
			Weapon w2 = new Weapon("150","Minigun");
			Weapon w3 = new Weapon("250","Pistola");
			Weapon w4 = new Weapon("240","Rifle");
			
			armory.enQueue(w1);
			armory.enQueue(w2);
			armory.enQueue(w3);
			armory.enQueue(w4);
			
			armory.remove("Pistola");
			
			assertEquals(3,armory.longitude());
		}

}
