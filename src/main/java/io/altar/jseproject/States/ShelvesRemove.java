package io.altar.jseproject.States;

public class ShelvesRemove extends State {

	@Override
	public int run() {
		if(BUSI_SHELVES.isEmpty()) {
			System.out.println("Nao tem prateleiras");
			return 1;
		}
		long remove =sc.getValidLong("Id do producto",BUSI_SHELVES.geAllIdsarray());
		switch (sc.getValidInt("remover:\\n 1) sim \\n 0)nao", 0, 1)) {
		case 0:
			break;
		case 1:
			BUSI_SHELVES.delete(remove);
			break;
		}
		return 1;
	}

}
