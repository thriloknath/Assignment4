package com.storemanagement.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.storemanagement.model.StoreDetail;

public interface StoreDetailRepo extends JpaRepository<StoreDetail, Integer> {
	List<StoreDetail> findByPincode(String pincode);
}
