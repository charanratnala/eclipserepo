package com.lhs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lhs.entity.SlotEntity;
@Repository
public interface Slot  extends JpaRepository<SlotEntity, Integer>{

}
