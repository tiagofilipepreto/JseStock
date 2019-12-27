package io.altar.jseproject.States;

public class MenuShelves extends State {

	@Override
	public int run() {
		System.out.println("Por favor selecione uma das seguintes opções:\n" + "1) Criar shelves\n"
				+ "2) Editar shelves existente\n" + "3) Consultar shelves\n"
				+ "4) Remover um shelves\n" + "5) Voltar ao ecrã anterior");
		BUSI_SHELVES.getshelvesId();
		int[] options= {1 ,2 ,3, 4, 5};
		return sc.getValidInt("selecionar ope�ao", options);
	}

}
