package Model;

public class Player implements Stack_Players<Weapon> {
	
	
	// declaration of variables
	
	// player types.
	private Player head;
	private Player queue;
	
	private Player next;
	private int size;
	private Node end;
	private String username;
	private double ping;
	// declaration of a weapon
	private Weapon ax;
	// declaration of a Hash table
	
	private String platform;
	private String ranking;
	
	private K key;
	private T value;
	private HashTable weapons;
	private Object ini;
	
	//Constructor.
	public Player(String k, String rank,String name, double pin,String p) {
		head =null;
		queue=null;
		next = null;
		size =0;
		ranking = rank;
		key = new K(k);
		value = new T(ranking);
		ping = pin;
		username = name;
		ax = new Weapon("0","0","ax");
		ini = new Object(ax.getK(),ax.getT());
		end = null;
		weapons = new HashTable(10);
		weapons.put(ini.getK(), ini.getT());
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

	public HashTable getWeapons() {
		return weapons;
	}

	public void setWeapons(HashTable weapons) {
		this.weapons = weapons;
	}
	

	public K getKey(){
		
		return key;
	}
	
	public void setKey(K n){
		
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
		
		int cant =0;
		if(head!=null){
			while(head.next !=null){
				cant++;
			}
		}
		return cant;
	}
	

	@Override
	public boolean isEmpty() {
		
		boolean emty= false;
		if(head ==null){
			emty=true;
		}
		return emty;
	}

	
	// Functional methods.
	
	// insert a Weapon in the hash table.
	public void insertWeaponHash(String a,String b,String c){
		
		Weapon h = new Weapon(a,b,c);
		
		while(search(h)){
			
			int newKey = Integer.parseInt(h.getKey())+1;
			h.setKey(Integer.toString(newKey));		
		}
	
		weapons.put(h.getK(), h.getT());
		
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
	
	public Weapon pop() {
		
		end = end.getNext();
		return end.getWeap();
		
	}

	@Override
	public Weapon getT() {
	
		return end.getWeap();
	}
	
	@Override
	public boolean search(Weapon o) {
		
		return weapons.searchKey(o.getK());
		
	}

	@Override
	public void remove(Weapon o) {
		
		weapons.removeKey(o.getK());
	}

}
