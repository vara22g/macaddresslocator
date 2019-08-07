package com.springexp.macaddresslocator.controller;

import com.springexp.macaddresslocator.model.ResponseModel;
import com.springexp.macaddresslocator.service.SearchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/mac")
public class SearchController {

	private static final Logger log = LoggerFactory.getLogger(SearchController.class);

	@Autowired
	private SearchService searchService;
	
	
	@RequestMapping(value = "/search/{macAddr}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public ResponseEntity<ResponseModel> getMacInfo(@PathVariable String macAddr) {
		
		String validMacAddr=null;
		if(macAddr.isEmpty())
			 log.error("EMPTY MAC address;" + macAddr);
		
		log.info("Inside getMacInfo in SearchController -- START"  + macAddr + validMacAddr);

	    ResponseModel response = searchService.getMacInfo(macAddr);
		
		log.info("Inside getMacInfo in SearchController-- END");

		return new ResponseEntity<>(response, HttpStatus.OK);

	}
}
