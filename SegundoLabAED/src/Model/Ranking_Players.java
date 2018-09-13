package Model;

public class Ranking_Players {
	
	private Player pointer;
	private int tam;
	
	public Ranking_Players(){
		pointer = null;
		tam=0;
	}
	
	public Player QueueUp(Player p) {
		Player temp = p;
		if(pointer.getQueue()==null && pointer.getHead()==null){
			pointer.setHead(p);
		}
		else{
			pointer.setNext(temp);
			pointer.setQueue(p);
			tam++;
		}
		
		return p;
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
	
	public int tamaño(){
	tam = pointer.longitude();
		return tam;
	}
	
	public Player getPointer(){
		return pointer;
	}
	

}
