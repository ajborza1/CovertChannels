package com.eCovertChannels.group4.model;

import java.util.Date;

import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;  

@Entity
@Table(name = "COVERT")  
public class Data   
{  

	@Id  
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column  
	private int covert_id;  
	
	@Column  
	private String covert_name;  
	 
	@Column  
	private String covert_type; 
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date covert_timestamp;
    

	@PrePersist
	private void onCreate() {
		covert_timestamp = new Date();
	}

	public int getCovert_id() {
		return covert_id;
	}

	public void setCovert_id(int covert_id) {
		this.covert_id = covert_id;
	}

	public String getCovert_name() {
		return covert_name;
	}

	public void setCovert_name(String covert_name) {
		this.covert_name = covert_name;
	}

	public String getCovert_type() {
		return covert_type;
	}

	public void setCovert_type(String covert_type) {
		this.covert_type = covert_type;
	}

	public Date getCovert_timestamp() {
		return covert_timestamp;
	}

	public void setCovert_timestamp(Date covert_timestamp) {
		this.covert_timestamp = covert_timestamp;
	}


}  