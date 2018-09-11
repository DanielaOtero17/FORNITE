package Model;

public class Object {
	
	private K k;
	private T t;
	
	public Object(K k,T t){
		
		this.k = k;
		this.t= t;
	}

	public K getK() {
		return k;
	}

	public void setK(K k) {
		this.k = k;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	

}
