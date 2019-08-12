package com.springexp.macaddresslocator.model;

import java.util.Date;

public class BlockDetails {
	/*block_found: boolean (False|True)
	border_left: string (MAC address, may be in the EUI-64)
	border_right: string (MAC address, may be in the EUI-64)
	block_size: int (long long int)
	assignment_block_size: string
	date_created: instance of datetime.datetime
	date_updated: instance of datetime.datetime*/
	
	
     /**
	 * @return the block_found
	 */
	public Boolean getBlock_found() {
		return block_found;
	}
	/**
	 * @param block_found the block_found to set
	 */
	public void setBlock_found(Boolean block_found) {
		this.block_found = block_found;
	}
	/**
	 * @return the border_left
	 */
	public String getBorder_left() {
		return border_left;
	}
	/**
	 * @param border_left the border_left to set
	 */
	public void setBorder_left(String border_left) {
		this.border_left = border_left;
	}
	/**
	 * @return the border_right
	 */
	public String getBorder_right() {
		return border_right;
	}
	/**
	 * @param border_right the border_right to set
	 */
	public void setBorder_right(String border_right) {
		this.border_right = border_right;
	}
	/**
	 * @return the block_size
	 */
	public int getBlock_size() {
		return block_size;
	}
	/**
	 * @param block_size the block_size to set
	 */
	public void setBlock_size(int block_size) {
		this.block_size = block_size;
	}
	/**
	 * @return the assignment_block_size
	 */
	public String getAssignment_block_size() {
		return assignment_block_size;
	}
	/**
	 * @param assignment_block_size the assignment_block_size to set
	 */
	public void setAssignment_block_size(String assignment_block_size) {
		this.assignment_block_size = assignment_block_size;
	}
	/**
	 * @return the date_created
	 */
	public Date getDate_created() {
		return date_created;
	}
	/**
	 * @param date_created the date_created to set
	 */
	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}
	/**
	 * @return the date_updated
	 */
	public Date getDate_updated() {
		return date_updated;
	}
	/**
	 * @param date_updated the date_updated to set
	 */
	public void setDate_updated(Date date_updated) {
		this.date_updated = date_updated;
	}
		
	private 
		Boolean block_found;
		String border_left;
        String border_right;
        int block_size;
        String assignment_block_size;
        Date date_created;
        Date date_updated;
        
        


}
