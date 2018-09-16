package Model;

public class Weapon {
	
	private Weapon next;
	private Weapon back;
	private String key;
	private String bullets;
	private String name;
	
	// Declaration of Constructor
	public Weapon(String ke, String b,String name) {
		
		next = null;
		back = null;
		key = ke;
		bullets = b;
		this.name = name;
	}
    // Getters and Setters

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	public String getName() {
		
		return name;
	}
	public Weapon getNext() {
		return next;
	}

	public void setNext(Weapon next) {
		this.next = next;
	}

	public Weapon getBack() {
		return back;
	}

	public void setBack(Weapon back) {
		this.back = back;
	}
	public String getBullets() {
		
		return bullets;
	}
	
	public void setBullets(String b) {
		
		bullets = b;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
