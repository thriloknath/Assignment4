package com.storemanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.storemanagement.model.StoreDetail;

@Service
public class StoreDetailService {

	@Autowired
	StoreDetailRepo storeDetailRepo;

	public Optional<StoreDetail> getById(int id) {
		return storeDetailRepo.findById(id);
	}

	public List<StoreDetail> getBYPincode(String pincode) {
		return storeDetailRepo.findByPincode(pincode);
	}

	public StoreDetail saveStoreDetails(StoreDetail storeDetail) {
		return storeDetailRepo.save(storeDetail);
	}

}
