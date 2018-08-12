package xyz.shebang.springcore;

import java.util.List;

public class Restaurant {
	
	List<String> waitersList;
	
	public void setWaitersList(List<String> waitersList) {
		this.waitersList = waitersList;
	}
	
	public void displayWaitersNames() {
		System.out.println("Waiters : " + waitersList);
	}
	
}
