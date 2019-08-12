/**
 * 
 */
package com.springexp.macaddresslocator.model;

/**
 * @author Vara
 *
 */
public class MacAddressDetails {

	//search_term: string
	//is_valid: boolean (False|True)
	//transmission_type: string
	//administration_type: string
	
	/**
	 * @return the search_term
	 */
	public String getSearch_term() {
		return search_term;
	}
	/**
	 * @param search_term the search_term to set
	 */
	public void setSearch_term(String search_term) {
		this.search_term = search_term;
	}
	/**
	 * @return the is_valid
	 */
	public Boolean getIs_valid() {
		return is_valid;
	}
	/**
	 * @param is_valid the is_valid to set
	 */
	public void setIs_valid(Boolean is_valid) {
		this.is_valid = is_valid;
	}
	
	/**
	 * @return the transmission_type
	 */
	public String getTransmission_type() {
		return transmission_type;
	}
	/**
	 * @param transmission_type the transmission_type to set
	 */
	public void setTransmission_type(String transmission_type) {
		this.transmission_type = transmission_type;
	}
	/**
	 * @return the administration_type
	 */
	public String getAdministration_type() {
		return administration_type;
	}
	/**
	 * @param administration_type the administration_type to set
	 */
	public void setAdministration_type(String administration_type) {
		this.administration_type = administration_type;
	}
	private
	String search_term;
	Boolean is_valid;
	String transmission_type;
	String administration_type;
	
}
