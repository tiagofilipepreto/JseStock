package io.altar.jseproject.States;

import java.util.ArrayList;

import io.altar.jseproject.model.Products;

public class ProductEdit extends State {
	int[]ivas= {23, 13, 6};
	@Override
	public int run() {
		if(BUSI_PRODDUCTS.isEmpty()) {
			System.out.println("Nao tem Productos");
			return 1;
		}
		Products product= BUSI_PRODDUCTS.read(sc.getValidLong("Id do producto",BUSI_PRODDUCTS.geAllIdsarray()));
		System.out.println("Nome do Producto: "+product.getNome());
		String nome =sc.getValue("Novo nome do producto");
		product.setNome(nome.isEmpty()? product.getNome():nome);
		
		System.out.println("Disconto(%) actual: "+product.getDiscount());
		int discount = sc.getInt("Colocar novo disconto(%):");
		product.setDiscount(discount==-1?product.getDiscount():discount);
		
		System.out.println("Iva(%) actual:"+product.getIva());
		int iva = sc.getValidInt("Colocar iva(%):",ivas);
		product.setIva(iva==-1?product.getIva():iva);
		
		System.out.println("preco inicial:"+product.getInitprice());
		float initPrice = sc.getFloat("colocar novo preco inicial",true);
		product.setInitprice(initPrice==-1?product.getInitprice():initPrice);
		
		float pvp = calcoloPvp(product.getDiscount(),product.getIva(),product.getInitprice());
		product.setPvp(pvp);
		
		long shelvesID;
		ArrayList <Long> arrayShelvesId =BUSI_PRODDUCTS.getshelvesId();
		do {
			if(arrayShelvesId.isEmpty()) {
				break;
			}
			System.out.println("Ids de prateleiras vazias"+arrayShelvesId);
			shelvesID =sc.getValidLongList("colocar id da prateleira", arrayShelvesId);
			if (shelvesID !=-1) {
				product.addShelvesId(shelvesID);
				arrayShelvesId.remove(shelvesID);
			}
		} while (shelvesID!=-1);
		
		BUSI_PRODDUCTS.update(product);
		return 1;
	}
	private float calcoloPvp (int discount,int iva,float initPrice) {
		float pv = initPrice*(1 + (float) iva/100);
		float discount1 = pv*(1* (float)discount/100);
		float pvp =pv - discount1;
		return pvp;
	}

}
