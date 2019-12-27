package io.altar.jseproject.States;


import io.altar.jseproject.Business.BusinessProducts;
import io.altar.jseproject.Business.BusinessShelf;
import io.altar.jseproject.textinterface.utils.Utils;

public abstract class State {
	
	public static final Utils sc =new Utils();
	public BusinessProducts BUSI_PRODDUCTS = new BusinessProducts();
	public BusinessShelf BUSI_SHELVES = new BusinessShelf();
	
	public abstract int run();
}
