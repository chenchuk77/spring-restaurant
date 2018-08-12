package xyz.shebang.springcore;

import org.springframework.stereotype.Component;

@Component
public class Tea implements IHotDrink {

	@Override
	public void prepareHotDrink() {
		System.out.println("preparing a tea...");
		
	}


}
