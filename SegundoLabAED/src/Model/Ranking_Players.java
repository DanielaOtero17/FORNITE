package Model;

public class Ranking_Players {
	
	private Player pointer;
	private int tam;
	
	public Ranking_Players(){
		
		pointer = null;
		tam=0;
	}
	
	public void QueueUp(Player p) {
		
		Player temp = p;
		
		if(pointer ==null){
			
			pointer = p;
			tam=1;
		}
		else{
			pointer.setNext(temp);
			pointer.setQueue(p);
			tam++;
		}
		
	}
	

	public Player QueueDown() {
		
		if( pointer.getHead() == null){
			return null;
			
		}
		Player temp = pointer.getHead();
		
		pointer.setHead(pointer.getHead().getNext());
		
		if(pointer.getHead() ==null){
			pointer.setQueue(null);
		}
		
		return temp;
	}
	
	public int tamanio(){
	
		return tam;
	}
	
	public Player getPointer(){
		return pointer;
	}
	

}
