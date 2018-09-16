package Interface;

public interface Map<K,T> {

public void removeKey(K o);
public void removeValue(T o);
public void put(K o,T t);
public boolean searchKey(K o);
public T searchValue(T o);
public boolean isEmpty();


}
