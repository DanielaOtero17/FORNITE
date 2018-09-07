package Model;

import java.util.Enumeration;
import java.util.Hashtable;

public class Platform {
	
	public final static int MAX_CUANTITY= 100;

	private Hashtable<String,String> players;
	private Player end;
	private int cuantity;
	
	public Platform(int player_cuantity){
		
		players = null;
		end = null;
		cuantity = player_cuantity;
		
	}
	
	public void insertNewPlayerStack(String key, String username,int ranking, double ping){
		
		if(end == null){
			
			end = new Player(key,username,ranking,ping);
		}else{
			
			end.setNext(new Player(key,username,ranking,ping));
			end = end.getNext();
		
		}
		
		players.put(key,username);
	}
	
	public int allKeys(){
		
		return players.size();
	}
	
	public void openPlatform(){
		
		if(allKeys() <= MAX_CUANTITY){
				
				Platform platform = new Platform(allKeys());
			}
			
		
		}
		
		
	}

