package com.vijay.multipleConfigurationFiles;

import org.springframework.beans.factory.annotation.Value;

public class Bean1 {
	
	private String a;

	/**
	 * @return the a
	 */
	public String getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	@Value("Vijay Upadhyay")
	public void setA(String a) {
		this.a = a;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bean1 [a=" + a + "]";
	}

}
