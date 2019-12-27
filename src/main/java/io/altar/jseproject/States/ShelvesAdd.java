package io.altar.jseproject.States;

import io.altar.jseproject.model.Shelfes;

public class ShelvesAdd extends State {

	@Override
	public int run() {
		int capacidade= sc.getInt("Colocar capacidade da shelf:");
		float dailyPrice=sc.getInt("Colocar pre�o diario:");
		
		
		Shelfes shelves = new Shelfes(capacidade,dailyPrice) ;
		
		BUSI_SHELVES.create(shelves);
		return 1;
	}

}
