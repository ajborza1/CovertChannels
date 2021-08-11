package com.eCovertChannels.group4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eCovertChannels.group.services.DataServices;
import com.eCovertChannels.group4.model.Data;

@RestController
public class InsertController {

	@Autowired
	DataServices dataService;
	
	
	@PostMapping("/insert")
	public int save(@RequestBody Data dataObject) {
		
		dataService.saveData(dataObject);
		return dataObject.getCovert_id();
		
	}
	
	
}
