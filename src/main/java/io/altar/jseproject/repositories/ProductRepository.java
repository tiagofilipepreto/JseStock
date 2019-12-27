package io.altar.jseproject.repositories;

import io.altar.jseproject.model.Products;

public class ProductRepository extends EntityRepository<Products> {
	
	
	private static final ProductRepository INSTANCE = new ProductRepository();
	
	public ProductRepository() {}
	
	public static ProductRepository getInstance() {
		return INSTANCE;
	}
	
}