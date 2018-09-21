package Model;

public class Player {
	
	private Player next;
	
	private String name;
	private String ping;
	
	private String platform;
	
	private int level;


	public Player(String nombre, String ping, String platform,int level) {
		this.next = null;
		this.name = nombre;
		this.ping = ping;
		this.platform = platform;
	}
	
	
	public Player getNext() {
		return next;
	}

	public void setNext(Player next) {
		this.next = next;
	}

	public String getPing() {
		return ping;
	}

	public void setPing(String ping) {
		this.ping = ping;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPlatform() {
		return platform;
	}


	public void setPlatform(String platform) {
		this.platform = platform;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}
	

}
