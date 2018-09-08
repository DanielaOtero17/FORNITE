package Model;

public class Weapon {
	
	private Weapon next;
	private Weapon back;
	private String key;
	private String bullets;
	
	// Declaration of Constructor
	public Weapon(String k, String b) {
		
		next = null;
		back = null;
		key = k;
		bullets = b;
	}
    // Getters and Setters

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
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
	
	

}
