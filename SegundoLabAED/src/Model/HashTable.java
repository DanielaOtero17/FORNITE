package Model;

import java.util.*;

public class HashTable implements Map<K,T> {

	private K key;
	private T value;
	private int tamanio;
	private Object[] array;
	
	public HashTable(int tamanio) {
		super();
		this.key = null;
		this.value = null;
		this.tamanio = tamanio;
		array = new Object[tamanio];
		
	}

	@Override
	public void removeKey(K o) {

	for(int i=0;i<array.length;i++){
			
			if(array[i].getK()==o){
				
				array[i]=null;
				break;
			}
		}
		
	}

	@Override
	public void removeValue(T o) {
		
		for(int i=0;i<array.length;i++){
			
			if(array[i].getT()==o){
				
				array[i]=null;
				break;
			}
		}
		
	}

	@Override
	public void put(K o, T t) {
		
		int counter = 0;
		Object obj = new Object(o,t);
		
		for(int i=0;i<array.length;i++){
			// it counts the elements that are stored in the array.
			while(array[i] != null){
				counter ++;;
			}
		}
		// if the array is 75 percent full.
		if(counter == array.length*0.75){
			// his size is duplicated.
			Object[] new_array = new Object[array.length*2];
			// we clone the new array to the initial array.
			new_array = array.clone();
			// Now the initial array has a new size.
			array = new_array;
				
		}
		for(int i=0;i<array.length;i++){
				
				while(searchKey(obj.getK())){
					
					int a = Integer.parseInt(obj.getK().getKey());
					String b = Integer.toString(a);
					K k = new K(b);
					obj.setK(k);
				}
			
			array[i] = obj;
		}		
	}

	@Override
	public boolean searchKey(K o) {
		
		boolean exists = false;
		
		for(int i = 0; i<array.length;i++){
			
			if(array[i].getK() == o){
				
				exists = true;
				return exists;
			}
		}
		return exists;
		
		
	}

	@Override
	public T searchValue(T o) {
		// TODO Auto-generated method stub
		return o;
	}

	@Override
	public boolean isEmpty() {
	
		int counter = 0;
		boolean isEmpty = false;
		
		for(int i=0;i<array.length;i++){
			
			// it counts the elements that are stored in the array.
			while(array[i] != null){
				
				counter ++;;
			}
	}
		if(counter==0){
			
			isEmpty = true;
		}
		return isEmpty;
	
}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public Object[] getArray() {
		return array;
	}

	public void setArray(Object[] array) {
		this.array = array;
	}
	
}