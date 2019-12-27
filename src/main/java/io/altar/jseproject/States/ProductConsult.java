package io.altar.jseproject.States;

public class ProductConsult extends State {

	@Override
	public int run() {
		if(BUSI_PRODDUCTS.isEmpty()) {
			System.out.println("Nao tem Productos");
			return 1;
		}
		System.out.println(BUSI_PRODDUCTS.read(sc.getValidLong("Id do producto",BUSI_PRODDUCTS.geAllIdsarray())));
		return 1;
	}

}
