package com.springexp.macaddresslocator.model;

public class VendorDetails {
/*
 oui: string
is_private: boolean (False|True)
company_name: string
company_address: string
country_code: string
 */
  private
	String oui;
    Boolean is_private;
	String company_name;
	String compay_address;
	String country_dode;
	/**
 * @return the oui
 */
public String getOui() {
	return oui;
}
/**
 * @param oui the oui to set
 */
public void setOui(String oui) {
	this.oui = oui;
}
/**
 * @return the is_private
 */
public Boolean getIs_private() {
	return is_private;
}
/**
 * @param is_private the is_private to set
 */
public void setIs_private(Boolean is_private) {
	this.is_private = is_private;
}
/**
 * @return the company_name
 */
public String getCompany_name() {
	return company_name;
}
/**
 * @param company_name the company_name to set
 */
public void setCompany_name(String company_name) {
	this.company_name = company_name;
}
/**
 * @return the compay_address
 */
public String getCompay_address() {
	return compay_address;
}
/**
 * @param compay_address the compay_address to set
 */
public void setCompay_address(String compay_address) {
	this.compay_address = compay_address;
}
/**
 * @return the country_dode
 */
public String getCountry_dode() {
	return country_dode;
}
/**
 * @param country_dode the country_dode to set
 */
public void setCountry_dode(String country_dode) {
	this.country_dode = country_dode;
}
	
	
}
