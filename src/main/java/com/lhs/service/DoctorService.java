package com.lhs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhs.entity.Doctor;
import com.lhs.entity.AppointmentTable;
import com.lhs.repo.DoctorRepo;
import com.lhs.repo.PatientRepo;

@Service
public class DoctorService {
	
	@Autowired
	DoctorRepo doctorRepo;
	
	Doctor doc;
	
	@Autowired
	PatientRepo details;
	
	AppointmentTable pat;
	
	public Doctor addDoctor(Doctor doctor)
	{
		
		
		
		 
				this.doc=		doctorRepo.save(doctor);
				System.out.println(this.doc);
				return doc;
		
	}
	
	
	
	
	
	public AppointmentTable addDoctors(AppointmentTable det)
	{
		//PatientDetails d=	details.findById(det.getId()).get();
		
//doc.getId();
		det.setDoctor(this.doc);
		System.out.println(this.doc);
	
		
		
		return details.save(det);
		//details.save(pat);
		
		
		
		
		
	}


}
