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
	public int longitude() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void enqueue(Object o) {
		// TODO Auto-generated method stub
		Player n = new Player();
		if(longitud==0) {
			cabezera =n;
			
		}
		
	}
	@Override
	public Object dequeue() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object head() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
