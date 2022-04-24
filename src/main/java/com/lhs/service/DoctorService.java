package com.lhs.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhs.dao.DoctorRepo;
import com.lhs.dao.PatientRepo;
import com.lhs.dao.Slot;
import com.lhs.entity.AppointmentTable;
import com.lhs.entity.Doctor;
import com.lhs.entity.SlotEntity;


@Service
public class DoctorService {
	
	@Autowired
	DoctorRepo doctorRepo;
	
	
	@Autowired
	Slot slot;
	
	
	
	Doctor doc;
	
	@Autowired
	PatientRepo details;
	
	AppointmentTable pat;
	
	public void addDoctor( Doctor doctor)
	{
		
	//	doctor.getSlotEntity().add(slotEntity);
		
		
//		System.out.println(slotEntity);
		
//		doctor.getSlotEntity().add(slotEntity);
		
				this.doc=		doctorRepo.save(doctor);
//				slot.save(slotEntity);
				System.out.println(this.doc);
				//return doc;
		
	}
	public void addSlot( SlotEntity slotEntity)
	{
		
	//	doctor.getSlotEntity().add(slotEntity);
		
		
		System.out.println(slotEntity);
		
		//doctor.getSlotEntity().add(slotEntity);
		
				//this.doc=		doctorRepo.save(doctor);
				slot.save(slotEntity);
				System.out.println(this.doc);
				//return doc;
		
	}
	
	
	
	
	
	public AppointmentTable addDoctors(AppointmentTable det)
	{
		//PatientDetails d=	details.findById(det.getId()).get();
		
//doc.getId();
//		det.setDoctor(this.doc);
//		System.out.println(this.doc);
	
		
		
		return details.save(det);
		//details.save(pat);
		
		
		
		
		
	}


}

