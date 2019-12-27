package io.altar.jseproject.States;

public class MenuInit extends State{

	@Override
	public int run() {
		System.out.println("Por favor selecione uma das seguintes opções:\n" + "1) Listar produtos\n"
				+ "2) Listar prateleiras\n" + "3) Sair");
		int[] options= {1 ,2 ,3};
		return sc.getValidInt("selecionar ope�ao", options);
		
	}

	
	}


