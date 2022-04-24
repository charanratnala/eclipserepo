package com.lhs.dao;


import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lhs.entity.Doctor;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Integer>{
	
	@Query("from Doctor where availableTime=:availableTime and unavailable=:unavailable")
public	List<Doctor> findDetailsOfDoctor(@Param("availableTime") Date from,@Param("unavailable") Date to);
	
	
	@Query("from Doctor where availableTime=:availableTime ")
	public	List<Doctor> findDetailsOfDoctor(@Param("availableTime") Date from);
	
	List<Doctor> findBySpecialistAndCityAndAvailableTime(String specialistname,String city,Date availableTime);
	
	public boolean existsByAvailableTime(Date availableTime);

	
	
public 	List<Doctor> findByDoctorName(String docname);

}

