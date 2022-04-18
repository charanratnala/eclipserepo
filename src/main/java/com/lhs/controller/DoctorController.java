package com.lhs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lhs.entity.Doctor;
import com.lhs.entity.AppointmentTable;
import com.lhs.payload.RequestList;
import com.lhs.payload.RequestName;
import com.lhs.repo.DoctorRepo;
import com.lhs.repo.PatientRepo;
import com.lhs.service.DoctorService;

@RestController
@RequestMapping("/api")
public class DoctorController {

	@Autowired
	DoctorRepo doctorRepo;
	@Autowired
	PatientRepo patientRepo;

	// DoctorService doctorService;

	@Autowired
	DoctorService doctorService;

	@PostMapping("/adddoctor")
	public ResponseEntity<String> addDoctor(@RequestBody Doctor doctor) {
		if (doctor == null) {
			throw new RuntimeException("null entity doctor");
		}
		Doctor d = doctorService.addDoctor(doctor);
		return new ResponseEntity<String>("saved dear " + d.getName(), HttpStatus.OK);

	}

	@GetMapping("/getappointment")
	public ResponseEntity<List<Doctor>> getDetails(@RequestBody RequestList req) {

		List<Doctor> doctor = doctorRepo.findDetailsOfDoctor(req.getFrom(), req.getTo());

		return new ResponseEntity<List<Doctor>>(doctor, HttpStatus.OK);

	}

	@GetMapping("/findbyspecialist")
	public ResponseEntity<?> bookAppointment(@RequestBody RequestName name) {
		// Doctor getDetails= doctorRepo.findBySpecialist(name.getSpecialist());
		List<Doctor> getDetailss = doctorRepo.findBySpecialistAndCity(name.getSpecialist(), name.getCity());

		// Doctor doc=null;
//		  if(getDetailss.isPresent())
//		  {
		// doc=getDetailss.get();
		return new ResponseEntity<List<Doctor>>(getDetailss, HttpStatus.OK);
	}
//		  else
//			  
//		  return new ResponseEntity<String>("Specialist not found",HttpStatus.NOT_FOUND);
//		  
//			  

	@PostMapping("/fillpatientdetails")
	ResponseEntity<AppointmentTable> fillDetails(
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestBody AppointmentTable patient) {

		AppointmentTable doc = doctorService.addDoctors(patient);
		return new ResponseEntity<AppointmentTable>(doc, HttpStatus.OK);

	}

	@GetMapping("/getpatient")
	ResponseEntity<List<AppointmentTable>> getDetails(@RequestBody AppointmentTable patient) {

		List<AppointmentTable> doc = (List<AppointmentTable>) patientRepo.findAll();
		return new ResponseEntity<List<AppointmentTable>>(doc, HttpStatus.OK);

	}

}
