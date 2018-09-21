package Model;

import Interface.QueueW;

public class Armory implements QueueW<Weapon>{
	
	private Weapon first;
	private Weapon end;
	private int size;
	
	public Armory() {

		first = null;
		end = null;
		
		size=1;
	}
	
	@Override
	public Weapon getFirst() {
		return first;
	}

	public void setFirts(Weapon first) {
		this.first = first;
	}

	@Override
	public Weapon getEnd() {
		return end;
	}

	public void setEnd(Weapon end) {
		this.end = end;
	}

	@Override
	public int longitude() {
		int cant =0;
		for(int i=0;i<size-1;i++) {
			cant++;
		}
		return cant;
	}

	@Override
	public boolean isEmpty() {
		boolean b = false;
		if(size == 0){
			b=true;
		}
		return b;
	}

	@Override
	public void enQueue(Weapon o) {
		Weapon n = o;
		if(first==null){
			first = n;
			end=n;
		}
		else{
			end.setNext(n);
			end=n;
		}
		size++;
	}

	@Override
	public Weapon deQueue() {
		if(first==null){
			return null;
		}
		Weapon ax = first;
		first = first.getNext();
		size--;
		return ax;
	}


	@Override
	public Weapon search(String o) {
		Weapon p = null;
		if(first.getName().equalsIgnoreCase(o)) {
			p=first;
		}
		else {
			while(first.getNext()!=null) {
				first=first.getNext();
			if(first.getName().equalsIgnoreCase(o)) {
				p=first;
			}
			}
		}
		return p;
	}

	@Override
	public boolean remove(String o) {
		boolean e =false;
		Weapon p = null;
		if(first.getName().equalsIgnoreCase(o)) {
			p=first;
		}
		else {
			while(first.getNext()!=null) {
				first=first.getNext();
			if(first.getName().equalsIgnoreCase(o)) {
				p=first;
			}
			}
			size--;
		}
		return e;
	}
	
	
	
}
