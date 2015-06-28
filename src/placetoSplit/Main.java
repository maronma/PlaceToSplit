package placetoSplit;

public class Main {
	public static void main(String[] args) {
		PlaceToSplit calc = new PlaceToSplit();
		Controler cont = new Controler();
		
		System.out.print("[");
		for(int t:cont.tab){			
		System.out.print(" "+t+" ");		
		}
		System.out.print("]---> ");
		System.out.print(calc.canBalance(cont.tab));
		System.out.println("");
		
		
		System.out.print("[");
		for(int t:cont.tab1){			
		System.out.print(" "+t+" ");		
		}
		System.out.print("]---> ");
		System.out.print(calc.canBalance(cont.tab1));
		System.out.println("");
		
		
		System.out.print("[");
		for(int t:cont.tab2){			
		System.out.print(" "+t+" ");		
		}
		System.out.print("]---> ");
		System.out.print(calc.canBalance(cont.tab2));
		System.out.println("");
		
		
		System.out.print("[");
		for(int t:cont.tab3){			
		System.out.print(" "+t+" ");		
		}
		System.out.print("]---> ");
		System.out.print(calc.canBalance(cont.tab3));
		System.out.println("");
		
		
		System.out.print("[");
		for(int t:cont.tab4){			
		System.out.print(" "+t+" ");		
		}
		System.out.print("]---> ");
		System.out.print(calc.canBalance(cont.tab4));
		System.out.println("");
		
		
		System.out.print("[");
		for(int t:cont.tab5){			
		System.out.print(" "+t+" ");		
		}
		System.out.print("]---> ");
		System.out.print(calc.canBalance(cont.tab5));
		System.out.println("");
		
		System.out.print("[");
		for(int t:cont.tab6){			
		System.out.print(" "+t+" ");		
		}
		System.out.print("]---> ");
		System.out.print(calc.canBalance(cont.tab6));
		System.out.println("");
		
		System.out.print("[");
		for(int t:cont.tab7){			
		System.out.print(" "+t+" ");		
		}
		System.out.print("]---> ");
		System.out.print(calc.canBalance(cont.tab7));
		System.out.println("");
		
//		System.out.print("[");
//		for(int t:cont.tab8){			
//		System.out.print(" "+t+" ");		
//		}
//		System.out.print("]---> ");
//		System.out.print(calc.canBalance(cont.tab8));
//		System.out.println("");
	}	
}
