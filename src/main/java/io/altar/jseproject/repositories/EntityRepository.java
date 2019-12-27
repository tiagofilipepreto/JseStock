package io.altar.jseproject.repositories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


import io.altar.jseproject.model.Entity;
import io.altar.jseproject.model.Products;
import io.altar.jseproject.model.Shelfes;

public abstract class EntityRepository<T extends Entity> {
	Map<Long, T> myMap= new HashMap<Long,T>();
	long maxId =1;
	

	public void addEntity(T t) {
		t.setId(maxId);
		myMap.put(maxId, t);
		maxId++;
	};
	private long getNextId() {
		return maxId +1;
	}
	
	public void removeEntity(long Id) {
		myMap.remove(Id);
	}; 
	
	public void removeEntity(T t) {
		myMap.remove(t.getId(), t);
	}; 
	
	
	public boolean isEmpty() {
		return (myMap.size() == 0)?true:false;
	}
	
	public Collection<T> getAll(){
		return myMap.values();
	}
	
	public T getEntity(long Id) {
		return  myMap.get(Id) ;
	}
	
	public void editEntity(long id, T t) {
		myMap.replace(id, t);
	}
	public void editEntity( T t) {
		myMap.replace(t.getId(), t);
	}
	
	public Collection<Long> getAllIDs(){
		return myMap.keySet();
	}
	
	public long[] geAllIdsarray(){
		return myMap.keySet().stream().mapToLong(l -> l).toArray();
	}
	

	
	
	
	public void printAll() {
		Iterator<T> prodInterator = getAll().iterator();
		while (prodInterator.hasNext()) {
			T t = (T) prodInterator.next();
			System.out.println(t);
		}
	}
	

	
//	public ArrayList<Long> getShelfCenas() {
//		Iterator<T> prodInterator = getAll().iterator();
//		ArrayList <Long> array = new ArrayList<Long>();
//		while (prodInterator.hasNext()) {
//			T t = (T) prodInterator.next();
//			Shelfes cenas = (Shelfes)t;
//			if (cenas.getProductId() == 0) {
//				array.add(cenas.getId());
//			}
//		}
//		return array;
//	}
	
	
}
