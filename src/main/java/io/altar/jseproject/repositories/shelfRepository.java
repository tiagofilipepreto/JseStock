package io.altar.jseproject.repositories;

import java.util.ArrayList;
import java.util.Iterator;

import io.altar.jseproject.model.Shelfes;

public class shelfRepository extends EntityRepository<Shelfes> {

private static final shelfRepository INSTANCE = new shelfRepository();
	
	public shelfRepository() {}
	
	public static shelfRepository getInstance() {
		return INSTANCE;
	}
	public ArrayList<Long> getShelfCenas() {
		Iterator<Shelfes> prodInterator = getAll().iterator();
		ArrayList <Long> array = new ArrayList<Long>();
		while (prodInterator.hasNext()) {
			Shelfes t = prodInterator.next();
			if (t.getProductId() == 0) {
				array.add(t.getId());
			}
		}
		return array;
	}
}
