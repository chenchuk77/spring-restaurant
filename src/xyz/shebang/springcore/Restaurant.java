package xyz.shebang.springcore;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Restaurant implements InitializingBean, DisposableBean{
	
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}

	public void showMessage() {
		System.out.println(message);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("running hook: afterPropertiesSet");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("running hook: destroy");
		
	}
	
	
}
