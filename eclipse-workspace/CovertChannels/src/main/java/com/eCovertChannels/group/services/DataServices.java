package com.eCovertChannels.group.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eCovertChannels.group4.model.Data;
import com.eCovertChannels.group4.repository.DataRepository;

@Service
public class DataServices {

	@Autowired 
	DataRepository dataRepository;
	
	public List<Data> getAllData(){
		
		List<Data> data = new ArrayList<Data>();
		dataRepository.findAll().forEach(covert -> data.add(covert));
		return data;
	}
	
	
	public Data getDataById(int id) {
		return dataRepository.findById(id).get();
	}
	
	public void saveData(Data data) {
		
		 dataRepository.save(data);
	}
}
