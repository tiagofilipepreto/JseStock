package io.altar.jseproject.States;

public class MenuProducts extends State {

	@Override
	public int run() {
		System.out.println("Por favor selecione uma das seguintes opções:\n" + "1) Criar novo produto\n"
				+ "2) Editar um produto existente\n" + "3) Consultar o detalhe de um produto\n"
				+ "4) Remover um produto\n" + "5) Voltar ao ecrã anterior");
		BUSI_PRODDUCTS.printaAll();
		int[] options= {1 ,2 ,3, 4, 5};
		return sc.getValidInt("selecionar ope�ao", options);
	}

}
