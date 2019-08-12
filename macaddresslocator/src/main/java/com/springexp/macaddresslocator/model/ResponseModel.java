package com.springexp.macaddresslocator.model;

import org.springframework.stereotype.Component;

@Component
public class ResponseModel {

	private String compnayName;
	private String macAddress;

	/**
	 * @return the compnayName
	 */
	public String getCompnayName() {
		return compnayName;
	}

	/**
	 * @param compnayName the compnayName to set
	 */
	public void setCompnayName(String compnayName) {
		this.compnayName = compnayName;
	}

	/**
	 * @return the macAddress
	 */
	public String getMacAddress() {
		return macAddress;
	}

	/**
	 * @param macAddress the macAddress to set
	 */
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

}
