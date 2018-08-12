package xyz.shebang.springcore;

public class Restaurant implements IHotDrink{
	
	String welcomeNote;
	IHotDrink hotDrink;
	
	public void setHotDrink(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}

	public void greetCustomer() {
		System.out.println(welcomeNote);
	}
	
	public void prepareHotDrink() {
		hotDrink.prepareHotDrink();
		
	}
	
}
