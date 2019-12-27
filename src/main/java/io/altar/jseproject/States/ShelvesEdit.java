package io.altar.jseproject.States;


import io.altar.jseproject.model.Shelfes;

public class ShelvesEdit extends State {

	@Override
	public int run() {
		if(BUSI_SHELVES.isEmpty()) {
			System.out.println("Nao tem prateleiras");
			return 1;
		}

		Shelfes shelve= BUSI_SHELVES.read(sc.getValidLong("Id do producto",BUSI_SHELVES.geAllIdsarray()));
		
		System.out.println("apacidade da prateleira: "+shelve.getCapacidade());
		int capacidade= sc.getInt("Colocar capacidade da shelf:");
		shelve.setCapacidade(capacidade==-1?shelve.getCapacidade():capacidade);
		
		
		System.out.println("Preco diario da prateleira: "+shelve.getDailyPrice());
		
		float dailyPrice=sc.getFloat("Colocar pre�o diario:",true);
		shelve.setDailyPrice(dailyPrice==-1?shelve.getDailyPrice():dailyPrice);
		
		if(BUSI_PRODDUCTS.isEmpty()) {
		}else {
			if(shelve.getProductId()!=0) {
				System.out.println("Preco diario da prateleira: "+shelve.getProductId());
			}
			long productId= sc.getValidLong("colocar id do Producto", BUSI_PRODDUCTS.geAllIdsarray());
			if (productId !=-1) {
				shelve.setProductId(productId);
			}
			shelve.setProductId(productId);
		}

		
		BUSI_SHELVES.update(shelve);

		return 1;
	}

}
