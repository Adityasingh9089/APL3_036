abstract class Beverage{
	
	void pour(int qty){
	    System.out.println("Pour"+ qty +"ml of Beverage");
			  }
	abstract void addContiment();
	void stir(){} //hook
	void Serve(){
	    System.out.println("Serve through waiter");
	    System.out.println("              ");
	    System.out.println("        --       ");
 	    System.out.println("            ");

	}
	public void templateMethod(int qty){
			pour(qty);
			addContiment();
			stir();
			Serve();
					}
	}