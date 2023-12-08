package com.pharmatest.pharma.model;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer test_id; 

	@Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date test_datetime;

	private String fname;
	private String phone;
	private byte[] img;

	
	private String selectedLabTest;
	private String selectedDoctor;

	
	
	public Patient() {
		
	}



	public Integer getTest_id() {
		return test_id;
	}



	public void setTest_id(Integer test_id) {
		this.test_id = test_id;
	}



	public Date getTest_datetime() {
		return test_datetime;
	}



	public void setTest_datetime(Date test_datetime) {
		this.test_datetime = test_datetime;
	}


	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public byte[] getImg() {
		return img;
	}



	public void setImg(byte[] img) {
		this.img = img;
	}



	public String getSelectedLabTest() {
		return selectedLabTest;
	}



	public void setSelectedLabTest(String selectedLabTest) {
		this.selectedLabTest = selectedLabTest;
	}



	public String getSelectedDoctor() {
		return selectedDoctor;
	}



	public void setSelectedDoctor(String selectedDoctor) {
		this.selectedDoctor = selectedDoctor;
	}



    
	
}
