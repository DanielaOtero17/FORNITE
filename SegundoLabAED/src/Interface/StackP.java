package Interface;

public interface StackP<T>{
	
	public T getT();
	public int longitude();
	public boolean isEmpty();
	public void insertStak(T o);
    public T getTop();
    public T search(String o);
    public boolean remove(String o);
    
    
}
