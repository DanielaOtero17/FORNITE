package Model;

public interface Queue_Players{
	
	public int longitude();
	public boolean isEmpty();
    public void enqueue(Object o);
    public Object dequeue();
    public Object head();
    
}
