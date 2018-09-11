package Model;

public class Node {

		
		Weapon weap;
		Node next;
		
		public Node(Weapon a){
			
			weap = a;
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
}
