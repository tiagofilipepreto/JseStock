package io.altar.jseproject.States;

public class ShelvesConsult extends State {

	@Override
	public int run() {
		if(BUSI_SHELVES.isEmpty()) {
			System.out.println("Nao tem prateleiras");
			return 1;
		}
		System.out.println(BUSI_SHELVES.read(sc.getValidLong("Id da Prateleira",BUSI_SHELVES.geAllIdsarray())));
		return 1;
	}

}
