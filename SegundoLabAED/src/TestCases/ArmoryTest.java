package TestCases;

import org.junit.Test;

import Model.Armory;
import Model.Weapon;

import static org.junit.Assert.*;

public class ArmoryTest {
	
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
