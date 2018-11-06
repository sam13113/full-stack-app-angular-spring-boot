package com.learning.fullstackappangularspringboot.model.response;

import com.learning.fullstackappangularspringboot.model.Links;

/**
 *
 * SlNo    Author   Date     Comment  
 * ----    ------   ------   --------
 *  01    sarat  2018-11-06  NewFile
 *
 */

public class ReservationResponse {

	private Long id;
	private Integer roomNumber;
	private Integer price;
	private Links links;

	/**
	 * 
	 */
	public ReservationResponse() {
		super();
	}

	/**
	 * @param roomNumber
	 * @param price
	 */
	public ReservationResponse(Integer roomNumber, Integer price) {
		super();
		this.roomNumber = roomNumber;
		this.price = price;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the roomNumber
	 */
	public Integer getRoomNumber() {
		return roomNumber;
	}

	/**
	 * @param roomNumber the roomNumber to set
	 */
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	/**
	 * @return the price
	 */
	public Integer getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}

	/**
	 * @return the links
	 */
	public Links getLinks() {
		return links;
	}

	/**
	 * @param links the links to set
	 */
	public void setLinks(Links links) {
		this.links = links;
	}

}
