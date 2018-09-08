package Model;

import java.util.Hashtable;

public class Player implements Queue_Players {
	
	public class Node{
		
		Weapon weap;
		Node next;
		
		public Node(Weapon a){
			
			weap = a;
			next = null;
		}
		
		public Node getNext(){
			return next;
		}
		
		public void setNext(Node n){
			
			next = n;
		}
		public Weapon getWeap(){
			
			return weap;
		}
	}
	// declaration of variables
	
	// player types.
	private Player head;
	private Player queue;
	
	private Player next;
	private int size;
	private Node end;
	private String key;
	private String username;
	private double ping;
	private String ranking;
	// declaration of a weapon
	private Weapon ax;
	// declaration of a Hash table
	private Hashtable<String,String> weapons;
	private String platform;
	
	//Constructor.
	public Player(String u, String rank, double pin,String p) {
		head =null;
		queue=null;
		next = null;
		size =0;
		key = u;
		ping = pin;
		ranking = rank;
		
		ax = new Weapon("ax","0");
		end = null;
		weapons = new Hashtable<String,String>();
		weapons.put(ax.getKey(), ax.getBullets());
		platform = p;
	}
	
	public Player getNext(){
		
		return next;
	}
	public void setNext(Player n){
		
		next=n;
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
	public void setRanking(String r) {
		ranking = r;
	}
	public String getRanking() {
	
		return ranking;
	}
	public void setPing(int size) {
		this.size = size;
	}
	public double getPing(){
	
		return ping;
	}

	public Hashtable<String, String> getWeapons() {
		return weapons;
	}

	public void setWeapons(Hashtable<String, String> weapons) {
		this.weapons = weapons;
	}
	

	public String getKey(){
		
		return key;
	}
	
	public void setKey(String n){
		
		key = n;
	}
	public void setUsername(String n){
		
		username = n;
	}
	public String getUsername(){
		
		return username;
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
	
	// insert a Weapon in the hash table.
	public void insertWeaponHash(String a,String b){
		
		weapons.put(a, b);
		 
		insertWeaponStack(new Weapon(a,b));
	}
	// inset a Weapon in the Stack
	public void insertWeaponStack(Weapon w){
		
		Node node = new Node(w);
		if(end == null){
			
			end = node;
		}else{
			
			node.setNext(end);
			end = node;
		}
	}
	
	// Gets the Top object from the stack.
	public Weapon getTop(){
		
		if(end == null){
			
			return ax;
		}
		return end.getWeap();
	}
	

}
