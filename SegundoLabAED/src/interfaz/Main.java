package interfaz;

import Model.Player;
import Model.Ranking_Players;
import Model.Weapon;
/**
 * 
 * @author 1061814203
 *Clase para probar por consola
 *
 */

public class Main {
	
	private Ranking_Players ranking;
	private Player p;
	private Weapon weap;
	
	public Main() {
		p  = new Player("123","2","Santiago",2.9,"Android");
		weap = new Weapon("100","5","AK-47");
		p.insertWeaponHash(weap.getKey(),weap.getBullets(),weap.getName());
	}


	public void jugador() {
		System.out.println(p.getUsername());
	}
	
	
	public static void main(String[] args) {
		Main windows = new Main() ;
		
		windows.jugador();
	}
	
	//Primero solucionar problema con la tabla
	// puntos de fallo
	
	// CLASE: Player ---- linea 210
	
	

}
