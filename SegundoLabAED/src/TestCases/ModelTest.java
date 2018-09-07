package TestCases;

import static org.junit.Assert.*;
import org.junit.Test;
import Model.*;

public class ModelTest {

	private Player player;
	private Weapon weap;
	
	public void allWeapons() {
		
		weap = new Weapon("001","AK-47",5);
		weap = new Weapon("001","Fusil",7);
		weap = new Weapon("001","Ametralladora",11);
		weap = new Weapon("001","Escopeta",4);
		weap = new Weapon("001","Lanzallamas",9);
		
	}
	
	public void stageOne(){
		
		player = new Player("001","Santiago",12,12354658,"Android");
		
	}
	@Test
	public void test() {
		
		allWeapons();
		stageOne();
		
	}

}
