package Interface;

public interface QueueW<T> {
	
	public int longitude();
	public boolean isEmpty();
	public void enQueue(T o);
	public T deQueue();
    public T getFirst();
    public T getEnd();
    public T search(String o);
    public boolean remove(String o);

}
