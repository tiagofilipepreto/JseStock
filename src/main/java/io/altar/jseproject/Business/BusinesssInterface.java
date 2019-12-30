package io.altar.jseproject.Business;


import java.util.Collection;
import java.util.Set;

import io.altar.jseproject.model.Entity;

public interface BusinesssInterface <T extends Entity>{
	
	void create(T t);
	
	T read(long id);
	
	T getId(long id);
	
	Collection<Long> getAllIDs();
	
	void delete (long Id);
	
	void update(T t);
	
	boolean isEmpty();
	
	void printaAll();
	
	long[] geAllIdsarray();
	
	Collection<T> getAll();
	
	
}
