//Template method pattern 

//Abstraction, Skeleton of the algo will remain same
class Main {
    public static void main(String args[]){
        Beverage b=new Whisky();
        b.templateMethod(30);
        Beverage c=new Beer();
        c.templateMethod(50);
        Beverage b2 = new Rum(); 
        b2.templateMethod(30);
	    Beverage b3 = new Vodka(); 
	    b3.templateMethod(30);
	    Beverage b4 = new Wine(); 
	    b4.templateMethod(30);
	}
    
}















// Class Whiskey{
// 	public void templateMethod(){
// 		pour();
// 		addContiment();
// 		Stir();
// 		Serve();
// 	}
// 	private void pour(){
// 		System.out.println("Pour 30ml of Whiskey");
// 			}
// 	private void addContiment(){
// 		Sytem.out.println("Add some soda");
// 			}
// 	private void Stir(){
// 		Sytem.out.println("Stir for 30 Seconds");
// 			}
// 	private void Serve(){
// 		Sytem.out.println("Serve appropriately");
// 			}
// 		}

// Class Rum{
// 	public void templateMethod(){
// 		pour();
// 		addContiment();
// 		Stir();
// 		Serve();
// 	}
// 	private void pour(){
// 		System.out.println("Pour 30ml of Rum");
// 			}
// 	private void addContiment(){
// 		Sytem.out.println("Add some soda");
// 			}
// 	private void Stir(){
// 		Sytem.out.println("Stir for 30 Seconds");
// 			}
// 	private void Serve(){
// 		Sytem.out.println("Serve appropriately");
// 			}
// 		}


// Class Beer{
// 	public void templateMethod(){
// 		pour();
// 		addContiment();
// 		Serve();
// 	}
// 	private void pour(){
// 		System.out.println("Pour 30ml of Beer");
// 			}
// 	private void addContiment(){
// 		Sytem.out.println("Add some Ice");
// 			}
// 	private void Serve(){
// 		Sytem.out.println("Serve appropriately");
// 			}
// 		}