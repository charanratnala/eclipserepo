package com.lhs.entity;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SlotHandler {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	 private LocalTime slot1; 
	 @Enumerated(EnumType.STRING)
	 private AppointmentStatus appointmentStatus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalTime getSlot1() {
		return slot1;
	}
	public void setSlot1(LocalTime slot1) {
		this.slot1 = slot1;
	}
	public AppointmentStatus getAppointmentStatus() {
		return appointmentStatus;
	}
	public void setAppointmentStatus(AppointmentStatus appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}
	public SlotHandler(int id, LocalTime slot1, AppointmentStatus appointmentStatus) {
		super();
		this.id = id;
		this.slot1 = slot1;
		this.appointmentStatus = appointmentStatus;
	}
	public SlotHandler() {
		super();
	}
	
	
	
	
	
	

}
