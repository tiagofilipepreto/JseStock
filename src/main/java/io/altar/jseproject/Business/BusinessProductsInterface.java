package io.altar.jseproject.Business;

import java.util.ArrayList;

import io.altar.jseproject.model.Products;
import io.altar.jseproject.repositories.ProductRepository;

public interface BusinessProductsInterface extends BusinesssInterface<Products> {
	ProductRepository PROD_REP_INSTACE = ProductRepository.getInstance();
	void updateProductsId(long ShelfeId, long ProductIdNovo, long ProductIdAntigo);
	ArrayList<Long> getshelvesId();
}
