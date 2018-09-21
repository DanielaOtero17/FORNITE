package Model;

import Interface.StackP;

public class Ranking implements StackP<Player>{
	
	private Player top;
	private int size;
	
	
	public Ranking() {
		top =null;
		size=0;
	}
	
	
	@Override
	public Player getT() {
		return top;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setTop(Player top) {
		this.top = top;
	}
	@Override
	public int longitude() {
		int cant =0;
		for(int i=0;i<size;i++) {
			cant++;
		}
		return cant;
	}
	@Override
	public boolean isEmpty() {
		boolean empty = false;
		if(top==null) {
			empty=true;
		}
		return empty;
	}
	@Override
	public void insertStak(Player o) {
		Player n = o;
		if(isEmpty()) {
			top=n;
		}
		else {
			n.setNext(top);
			top=n;
		}
		
		size++;
	}
	@Override
	public Player getTop() {
		return top;
	}
	@Override
	public Player search(String o) {
		Player p = null;
		if(top.getName().equalsIgnoreCase(o)) {
			p=top;
		}
		else {
			while(top.getNext()!=null) {
			top=top.getNext();
			if(top.getName().equalsIgnoreCase(o)) {
				p=top;
			}
			}
		}
		return p;
	}
	@Override
	public boolean remove(String o) {
		boolean e =false;
		Player p = null;
		if(top.getName().equalsIgnoreCase(o)) {
			p=top;
		}
		else {
			while(top.getNext()!=null) {
			top=top.getNext();
			if(top.getName().equalsIgnoreCase(o)) {
				p=top;
			}
			}
			size--;
		}
		return e;
	}
	
	public void levelUp() {
		//hacer metodo
	}
	

}
