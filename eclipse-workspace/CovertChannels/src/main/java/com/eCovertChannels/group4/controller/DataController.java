package com.eCovertChannels.group4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eCovertChannels.group.services.DataServices;
import com.eCovertChannels.group4.model.Data;
import com.eCovertChannels.group4.repository.DataRepository;

@RestController
public class DataController {

	@Autowired
	DataServices dataServices;
	
	@Autowired 
	DataRepository dataRepository;
	
	@GetMapping("/data")
	private List<Data> getAllData(Model model){
		
		List<Data> dataRepo = dataServices.getAllData();
		model.addAttribute("data",dataRepo);
		
		return dataRepo;
	}
	
}

//
//sql = null;
//sql = "INSERT INTO COVERT " + "VALUES(1, 'TCP', 'Timing')";
//sql = "INSERT INTO COVERT " + "VALUES(1, 'TCP', 'Timing')";
//sql = "INSERT INTO COVERT " + "VALUES(1, 'TCP', 'Timing')";
