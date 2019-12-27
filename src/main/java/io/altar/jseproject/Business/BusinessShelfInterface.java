package io.altar.jseproject.Business;

import java.util.List;

import io.altar.jseproject.model.Shelfes;
import io.altar.jseproject.repositories.shelfRepository;

public interface BusinessShelfInterface extends BusinesssInterface<Shelfes> {
	shelfRepository SHELF_REP_INSTACE = shelfRepository.getInstance();
		void updateProductsId(List <Long> shelvesIdAntigos, List <Long> shelvesIdNovos, long id);
		
}
