package com.lhs.entity;

import java.sql.Date;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class SlotEntity {
	
	@Override
	public String toString() {
		return "SlotEntity [id=" + id + ", operationDate=" + operationDate + ", slot1=" + slot1 + ", slot2=" + slot2
				+ ", slot3=" + slot3 + ", dc=" + dc + ", slot4=" + slot4 + ", slotStatus=" + slotStatus + "]";
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Date operationDate;
	
	private LocalTime slot1;
	private LocalTime slot2;
	private LocalTime slot3;
	public SlotEntity(int id, Date operationDate, LocalTime slot1, LocalTime slot2, LocalTime slot3, LocalTime slot4,
			boolean slotInfo) {
		super();
		this.id = id;
		this.operationDate = operationDate;
		this.slot1 = slot1;
		this.slot2 = slot2;
		this.slot3 = slot3;
		this.slot4 = slot4;
	
	}


	@OneToOne
	Doctor dc;
	public Doctor getDc() {
		return dc;
	}



	public void setDc(Doctor dc) {
		this.dc = dc;
	}


	private LocalTime slot4;
	//private LocalTime M1230;


	
	
	private boolean slotStatus;



	public boolean isSlotStatus() {
		return slotStatus;
	}



	public void setSlotStatus(boolean slotStatus) {
		this.slotStatus = slotStatus;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Date getOperationDate() {
		return operationDate;
	}



	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}



	public LocalTime getSlot1() {
		return slot1;
	}



	public void setSlot1(LocalTime slot1) {
		this.slot1 = slot1;
	}



	public LocalTime getSlot2() {
		return slot2;
	}



	public void setSlot2(LocalTime slot2) {
		this.slot2 = slot2;
	}



	public LocalTime getSlot3() {
		return slot3;
	}



	public void setSlot3(LocalTime slot3) {
		this.slot3 = slot3;
	}



	public LocalTime getSlot4() {
		return slot4;
	}



	public void setSlot4(LocalTime slot4) {
		this.slot4 = slot4;
	}



	public boolean isSlotInfo() {
		return isSlotInfo();
	}






	public SlotEntity() {
		super();
	}//private Timestamp createdAt= new Timestamp(System.currentTimeMillis());
}
