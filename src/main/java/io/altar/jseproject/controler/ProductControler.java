package io.altar.jseproject.controler;



import java.util.ArrayList;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import io.altar.jseproject.Business.BusinessProducts;
import io.altar.jseproject.model.Products;


@Path("products")
public class ProductControler extends Controler<BusinessProducts ,Products>{
	
	public ProductControler() {
		service = new BusinessProducts();
	}
	
	@GET
	@Path("getshelvesIdEmpty")
	@Produces("application/json")
	public ArrayList<Long> getshelvesId() {
		return service.getshelvesId();
	}
}
