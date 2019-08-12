package com.springexp.macaddresslocator.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springexp.macaddresslocator.controller.SearchController;
import com.springexp.macaddresslocator.model.ResponseModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;


@Service
public class SearchService {

	private static final Logger log = LoggerFactory.getLogger(SearchController.class);

	
	
	public ResponseModel getMacInfo(String macAddr) {
		log.info("Inside getMacinfo in SearchService -- START");
		//String url = "https://api.macaddress.io/v1?apiKey=at_HoOBouTKI3u1CDOmpTmtS5gF6IZPJ&output=json&search={macAddr}";
		//url = url.replaceAll("\\{macAddr\\}", macAddr);
		
		String url = "https://api.macaddress.io/v1?apiKey=at_HoOBouTKI3u1CDOmpTmtS5gF6IZPJ&output=json&search={macAddr}";
		url = url.replaceAll("\\{macAddr\\}", macAddr);

		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> request = new HttpEntity<String>("", header);
		ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, request, String.class);

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		Map response = null;
		try {
			response = mapper.readValue(responseEntity.getBody(), Map.class);
		} catch (IOException e) {
			log.error("Error while unmarshalling", e);
		}
		//MacAddrResponse macAddrResp=(MacAddrResponse) response;
		/*MacAddrResponse response = null;
		try {
			response = mapper.readValue(responseEntity.getBody(), MacAddrResponse.class);
		} catch (IOException e) {
			log.error("Error while unmarshalling", e);
		}*/

		LinkedHashMap vendorDetails = (LinkedHashMap) response.get("vendorDetails");
		LinkedHashMap macAddreDetails = (LinkedHashMap) response.get("macAddressDetails");
		//VendorDetails vendorDetails = (VendorDetails) response.get("vendorDetails");
		

		ResponseModel respModel = new ResponseModel();
		respModel.setCompnayName((String) vendorDetails.get("companyName"));
		respModel.setMacAddress((String) macAddreDetails.get("searchTerm"));

		log.info("Inside getMacinfo in SearchService -- END");
		return respModel;

	}
}
