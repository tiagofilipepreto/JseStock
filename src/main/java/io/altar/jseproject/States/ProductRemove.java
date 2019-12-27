package io.altar.jseproject.States;

public class ProductRemove extends State {

	@Override
	public int run() {
		if(BUSI_PRODDUCTS.isEmpty()) {
			System.out.println("Nao tem Productos");
			return 1;
		}
		long remove =sc.getValidLong("Id do producto",BUSI_PRODDUCTS.geAllIdsarray());
		switch (sc.getValidInt("remover:\\n 1) sim \\n 0)nao", 0, 1)) {
		case 0:
			break;
		case 1:
			BUSI_PRODDUCTS.delete(remove);
			System.out.println("Producto removido.");
			break;
		}
		return 1;
	}

}
