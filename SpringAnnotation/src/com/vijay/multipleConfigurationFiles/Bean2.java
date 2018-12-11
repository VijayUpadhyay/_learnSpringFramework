package com.vijay.multipleConfigurationFiles;

import org.springframework.beans.factory.annotation.Value;

public class Bean2 {
	private String b;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bean2 [b=" + b + "]";
	}

	/**
	 * @return the b
	 */
	public String getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	@Value("Inside bean2")
	public void setB(String b) {
		this.b = b;
	}
	

}
