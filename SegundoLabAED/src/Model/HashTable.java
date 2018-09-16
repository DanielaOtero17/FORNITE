package Model;

import java.util.*;
import Interface.Map;



public class HashTable<K,T> implements Map<K,T> {

	private K key;
	private T value;
	private int tamanio;
	private Node[] array;
	private Node next;
	
	public HashTable(int tam) {
	
		tamanio = tam;
		array = new Node[tamanio];
		
		for(int i=0; i<array.length; i++){
			
			array[i] = new Node();
		}
	}

	@Override
	public void removeKey(K o) {

	for(int i=0;i<array.length;i++){
			
			if(array[i].getKey()==o){
				
				array[i]=null;
				break;
			}
		}
		
	}

	@Override
	public void removeValue(T o) {
		
		for(int i=0;i<array.length;i++){
			
			if(array[i].getValue()==o){
				
				array[i]=null;
				break;
			}
		}
		
	}

	@Override
	public void put(K o, T t) {
		
		int counter = containsKeys();
		
		if(isEmpty()){
			
			array[0].setKey(o);
			array[0].setValue(t);
			
		}
		if(counter>0 && counter == array.length*0.75){
			// his size is duplicated.
			Node[] new_array = new Node[array.length*2];
			// we clone the new array to the initial array.
			new_array = array.clone();
			// Now the initial array has a new size.
			array = new_array;
				
		}			
		for(int i=0; i<array.length; i++){
				
				
			if(array[i].getKey()!= null && array[i].getKey() == o){
				
				Node aux = array[i];
						
		while(i<array.length && aux.getNext().getKey() !=null){
							
						aux = array[i].getNext();		
						i++;
							
					}						
						array[i].getNext().setKey(o);
						array[i].getNext().setValue(t);
				}
						
				}
	}				

	@Override
	public boolean searchKey(K o) {
		
		boolean exists = false;
		int count = 0;
		int aux = containsKeys();
		
		if(isEmpty()){
			
			return exists;
		}else{
		
			for(int i = 0; i<aux; i++){
				
				if(array[i].getKey() == o){

					exists = true;
				}
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
			while(array[i].getKey() != null){
				
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

	public void setArray(Node[] array) {
		this.array = array;
	}
	
	public int containsKeys(){
		
		int counter = 0;
		
		for(int i=0;i<array.length;i++){
			// it counts the elements that are stored in the array.
			while(array[i].getKey() != null){
				counter ++;;
			}
	}
		return counter;
	}			
			
			
}