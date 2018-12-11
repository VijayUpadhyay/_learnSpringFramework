package com.vijay.setListMapUsingAnnotation;

import java.util.Date;
import java.util.Map;

public class StockMarket {
	
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	Map<Integer,Company> companyMap;
	private Date date;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StockMarket [companyMap=" + companyMap + ", date=" + date + "]";
	}

	/**
	 * @return the companyMap
	 */
	public Map<Integer, Company> getCompanyMap() {
		return companyMap;
	}

	/**
	 * @param companyMap the companyMap to set
	 */
	public void setCompanyMap(Map<Integer, Company> companyMap) {
		this.companyMap = companyMap;
	}

}
