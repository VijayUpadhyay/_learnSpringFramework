package com.vijay.initializingAndDisposableBeans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

public class TestBeans implements InitializingBean,DisposableBean{

	String message;
	
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	@Value(value="Testing Initializing and Disposable Beans")
	public void setMessage(String message) {
		this.message = message;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TestBeans [message=" + message + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy "+message);
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet "+message);
	}

}
