package com.storemanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.storemanagement.model.StoreDetail;
import com.storemanagement.service.StoreDetailService;

@RestController
@RequestMapping("/store")
public class StoreController {

	@Autowired
	StoreDetailService detailServiceImpl;

	@GetMapping("/{id}")
	ResponseEntity<Optional<StoreDetail>> getStoreDetails(@PathVariable int id) {
		Optional<StoreDetail> storeDetail = detailServiceImpl.getById(id);
		if (storeDetail.isPresent()) {
			return ResponseEntity.ok(storeDetail);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("pin/{pincode}")
	ResponseEntity<List<StoreDetail>> getListOfStoreDetails(@PathVariable String pincode) {
		List<StoreDetail> storeDetail = detailServiceImpl.getBYPincode(pincode);
		if (storeDetail.size() > 0) {
			return ResponseEntity.ok(storeDetail);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	@PostMapping
	public ResponseEntity<StoreDetail> postStoreDetails(@RequestBody StoreDetail storeDetail) {
		StoreDetail store_detail = detailServiceImpl.saveStoreDetails(storeDetail);
		return ResponseEntity.ok(store_detail);
	}

}
