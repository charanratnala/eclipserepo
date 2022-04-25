package com.lhs.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.lhs.entity.SlotEntity;
@Repository
public interface Slot  extends PagingAndSortingRepository<SlotEntity, Integer>{

}
