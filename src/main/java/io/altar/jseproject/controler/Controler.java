package io.altar.jseproject.controler;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import io.altar.jseproject.Business.BusinessEntity;
import io.altar.jseproject.model.Entity;
import io.altar.jseproject.model.Products;

public abstract class Controler <T extends BusinessEntity<E>,E extends Entity>{
	
	protected T service;
	@Context
	protected UriInfo context;

	
	@GET
	@Path("status")
	@Produces(MediaType.TEXT_PLAIN)
	public String status() {
		return "url : "+ context.getRequestUri().toString()+"is Ok";
	}
	
	@POST
	@Consumes("application/json")
	public void addProduct(E t) {
		service.create(t);
	}
	
	@PUT
	@Consumes("application/json")
	public void editProduct(E t) {
		service.update(t);
	}
	
	@GET
	@Path("{id}")
	@Produces("application/json")
	public E getProduct(@PathParam("id")long id) {
//		verificar se precisa BUSI_PRODDUCTS.read(sc.getValidLong("Id do producto",BUSI_PRODDUCTS.geAllIdsarray()))
		return service.read(id);
	}
	
	@DELETE
	@Path("{id}")
	public void deleteProduct(@PathParam("id")long id) {
		service.delete(id);
	}
	
	@GET
	@Produces("application/json")
	public Collection<E> getProduct() {
		return service.getAll();
	}
	
	@GET
	@Path("isEmpty")
	@Produces("text/plain")
	public boolean isEmpty() {
		return service.isEmpty();
	}
	
	@GET
	@Path("getAllIds")
	@Produces("application/json")
	public long[] geAllIdsarray() {
		return service.geAllIdsarray();
	}
	
	
}
