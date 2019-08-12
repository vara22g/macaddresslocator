package com.springexp.macaddresslocator.model;

public class MacAddrResponse {
	
	private VendorDetails vendorDetails;
	private BlockDetails blockDetails;
	private MacAddressDetails macAddrDetails;
	/**
	 * @return the vendorDetails
	 */
	public VendorDetails getVendorDetails() {
		return vendorDetails;
	}
	/**
	 * @param vendorDetails the vendorDetails to set
	 */
	public void setVendorDetails(VendorDetails vendorDetails) {
		this.vendorDetails = vendorDetails;
	}
	/**
	 * @return the blockDetails
	 */
	public BlockDetails getBlockDetails() {
		return blockDetails;
	}
	/**
	 * @param blockDetails the blockDetails to set
	 */
	public void setBlockDetails(BlockDetails blockDetails) {
		this.blockDetails = blockDetails;
	}
	/**
	 * @return the macAddrDetails
	 */
	public MacAddressDetails getMacAddrDetails() {
		return macAddrDetails;
	}
	/**
	 * @param macAddrDetails the macAddrDetails to set
	 */
	public void setMacAddrDetails(MacAddressDetails macAddrDetails) {
		this.macAddrDetails = macAddrDetails;
	}
	
	

}
