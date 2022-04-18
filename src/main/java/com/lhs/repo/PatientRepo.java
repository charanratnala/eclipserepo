package com.lhs.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lhs.entity.AppointmentTable;

@Repository
public interface PatientRepo extends CrudRepository<AppointmentTable, Integer>{

}
