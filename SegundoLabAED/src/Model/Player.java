package Model;

import java.util.Enumeration;
import java.util.Hashtable;

public class Player implements Stack_Players<Weapon> {
	
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
	
	private String platform;
	
	private Hashtable<String,String> weapons;
	
	//Constructor.
	public Player(String key, String rank,String name, double pin,String p) {
		head =null;
		queue=null;
		next = null;
		size =0;
		this.key = key;
		ping = pin;
		ranking = rank;
		username = name;
		
		ax = new Weapon("0","0","ax");
		end = null;
		weapons = new Hashtable<String,String>(10);
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

	
	// Functional methods.
	
	// insert a Weapon in the hash table.
	public void insertWeaponHash(String a,String b,String c){
		
		Weapon h = new Weapon(a,b,c);
		
		while(search(h)){
			
			int newKey = Integer.parseInt(h.getKey())+1;
			h.setKey(Integer.toString(newKey));		
		}
		weapons.put(h.getKey(), h.getBullets());
		
		insertWeaponStack(new Weapon(a,b,c));
	}
	
	// insert a Weapon in the Stack
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
	@Override
	public Weapon getTop(){
		
		if(end == null){
			
			return ax;
		}
		return end.getWeap();
	}

	@Override
	public Weapon getT() {
		// TODO Auto-generated method stub
		return ax;
	}

	@Override
	public void pileUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean search(Weapon o) {
		
		boolean search = false;
		
		if(weapons.containsKey(o.getKey())){
			search = true;
		}
		return search;
	/*	Enumeration e = weapons.keys();
		Object key;
		boolean search = false;
		while(e.hasMoreElements()){
		
		key = e.nextElement();
		
		if(key.toString().equals(o.getKey())){
			
			search = true;
			return search;
		}	
		}*/
		
		
	}

	@Override
	public void remove(Weapon o) {
		
		weapons.remove(o.getKey());
		
	}
	

}
