package xyz.shebang.springcore;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Restaurant {
	
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}

	public void showMessage() {
		System.out.println(message);
	}

	@PostConstruct
	public void init() {
		System.out.println("init() called.");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy() called.");
	}
	
	
}
