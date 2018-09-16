package Model;

public class Node<K,T>{

		

	private Weapon weap;
	private Node next;
	private K key;
	private T value;
	
	
	public Node(Weapon a){
		
		weap = a;
		next = null;
	}
	
	public Node(){
		
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
	
	public K getKey(){
		return key;
	}
	
	public void setKey(K k){
		
		key = k;
	}
	
	public T getValue(){
		return value;
	}
	
	public void setValue(T v){
		
		value = v;
	}
	
	
}

