package modelo;

public class Player implements Queue_Players {
	
	private Player cabezera;
	private Player cola;
	private int longitud;
	
	private String name; 
	
	
	public Player() {
		cabezera =null;
		cola=null;
		longitud =0;
	}
	
	/**
	 * metodos bjjjjhhghghgh
	 */
	
	@Override
	public int longitud() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isVAcia() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void encolar(Object o) {
		// TODO Auto-generated method stub
		Player n = new Player();
		if(longitud==0) {
			cabezera =n;
			
		}
		
	}
	@Override
	public Object desencolar() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object cabezera() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
