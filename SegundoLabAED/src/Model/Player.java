package Model;

import java.util.Hashtable;

public class Player implements Queue_Players {
	
	// declaration of variables
	
	// player types.
	private Player head;
	private Player queue;
	private int size;
	// declaration of a weapon
	private Weapon ax;
	// declaration of a Hash table
	private Hashtable<String,String> weapons;
	
	//Constructor.
	public Player() {
		head =null;
		queue=null;
		size =0;
		ax = new Weapon("1","ax");
		weapons = new Hashtable<String,String>();
		weapons.put(ax.getKey(), ax.getName());
	}
	
	//Getters and Setters
	
	public Player getHead() {
		return head;
	}

	public void setHead(Player head) {
		this.head = head;
	}

	public Player getQueue() {
		return queue;
	}

	public void setQueue(Player queue) {
		this.queue = queue;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Hashtable<String, String> getWeapons() {
		return weapons;
	}

	public void setWeapons(Hashtable<String, String> weapons) {
		this.weapons = weapons;
	}

	/**
	 * Methods from interface.
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
		if(size==0) {
			head =n;
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
	
	// Functional methods.
	
	public void insertWeapon(String a,String b){
		
		weapons.put(a, b);
	}
	
	

}
