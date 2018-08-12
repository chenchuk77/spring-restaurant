package xyz.shebang.springcore;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Restaurant implements IHotDrink{
	
	String welcomeNote;
	
	@Autowired
	IHotDrink hotDrink;
	
	Restaurant(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}
//	public void setWelcomeNote(String welcomeNote) {this.welcomeNote = welcomeNote;}
	
	public void greetCustomer() {
		System.out.println(welcomeNote);
	}
	
	@Override
	@PostConstruct
	public void prepareHotDrink() {
		hotDrink.prepareHotDrink();
		
	}
	
}
