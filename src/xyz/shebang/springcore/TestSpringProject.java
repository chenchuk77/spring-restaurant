package xyz.shebang.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		
		//Thread.sleep(5000);
		
		System.out.println("getting bean for r1...");
		Restaurant r1 = (Restaurant) context.getBean("restaurantBean");
		r1.showMessage();
		System.out.println(r1);

		System.out.println("getting bean for r2...");
		Restaurant r2 = (Restaurant) context.getBean("restaurantBean");
		r2.showMessage();
		System.out.println(r2);

		System.out.println("execution done.");
		
		
		((AbstractApplicationContext) context).registerShutdownHook();
	} 
}
