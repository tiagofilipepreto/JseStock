package io.altar.jseproject.Business;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import io.altar.jseproject.model.Products;
import io.altar.jseproject.model.Shelfes;


public class BusinessProducts extends BusinessEntity <Products> implements BusinessProductsInterface {

	public static final BusinessShelf BUSINESS_SHELVES = new BusinessShelf();

	@Override
	public void create(Products t) {
		PROD_REP_INSTACE.addEntity(t);
		BUSINESS_SHELVES.updateProductsId(new ArrayList<Long>(),t.getShelvesId(),t.getId());
		
	}
	@Override
	public Products read(long id) {
		return PROD_REP_INSTACE.getEntity(id);
	}

	@Override
	public void delete(long Id) {
		 List <Long>shelvesIdAntigos = read(Id).getShelvesId();
		PROD_REP_INSTACE.removeEntity(Id);
		BUSINESS_SHELVES.updateProductsId(shelvesIdAntigos,new ArrayList<Long>(),Id);
		
	}
	
	@Override
	public void update(Products t) {
		 List <Long>shelvesIdAntigos = read(t.getId()).getShelvesId();
		PROD_REP_INSTACE.editEntity(t);
		BUSINESS_SHELVES.updateProductsId(shelvesIdAntigos,t.getShelvesId(),t.getId());
	}
	
	
	@Override
	public boolean isEmpty() {
		return PROD_REP_INSTACE.isEmpty();
	}
	@Override
	public void printaAll() {
		PROD_REP_INSTACE.printAll();
		
	}
	@Override
	public Collection<Long> getAllIDs() {
		return null;
	}
	@Override
	public long[] geAllIdsarray() {
		return PROD_REP_INSTACE.geAllIdsarray();
	}
	@Override
	public void updateProductsId(long ShelfeId, long ProductIdNovo, long ProductIdAntigo) {
		if(ProductIdAntigo >0) {
		Products productIdRemove=PROD_REP_INSTACE.getEntity(ProductIdAntigo);
		productIdRemove.removeshelvesId(ShelfeId);
		PROD_REP_INSTACE.editEntity(productIdRemove);
		}
		if (ProductIdNovo >0) {
			Products productIdedit=PROD_REP_INSTACE.getEntity(ProductIdNovo);
			productIdedit.addShelvesId(ShelfeId);
			PROD_REP_INSTACE.editEntity(productIdedit);
		}
		
	}
	@Override
	public ArrayList<Long> getshelvesId() {
		return BUSINESS_SHELVES.getshelvesId();
	}
	@Override
	public Collection<Products> getAll() {
		return PROD_REP_INSTACE.getAll();
	}
	
}
