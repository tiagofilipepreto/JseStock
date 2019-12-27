package io.altar.jseproject.test;

import io.altar.jseproject.States.*;

public class TexInterfaceState {
	
	  private State[] states = {
			  new MenuInit(), 	    //0	
			  new MenuProducts(), 	    //1
			  new ProductAdd(),    	//2
			  new ProductEdit(),	//3
			  new ProductConsult(),//4
			  new ProductRemove(),  //5
			  new MenuShelves(),        //6
			  new ShelvesAdd(),		//7
			  new ShelvesEdit(),	//8
			  new ShelvesConsult(), //9
			  new ShelvesRemove()   //10
			  
	  };
	    // 4. transitions
	    private int[][] transition = {
	    			{ 1, 6},      //State 0
	    			{ 2, 3, 4, 5, 0}, 	  //state 1
	    			{ 1 },				  //state 2
	    			{ 1 },				  //state 3
	    			{ 1 },				  //state 4
	    			{ 1 },				  //state 5
	    			{ 7, 8, 9, 10, 0},	  //state 6
	    			{ 6 },				  //state 7
	    			{ 6 },				  //state 8
	    			{ 6 },				  //state 9
	    			{ 6 },				  //state 10
	    };
	    // 3. current
	    private int current = 0;
	
	public void Start() {
		while (true) {
			int option = states[current].run();
			if (current == 0&& option == 3) {
				System.out.println("Saida.");
				break;
				
			}
			current = transition[current][option-1];
			
		}
	}
}
