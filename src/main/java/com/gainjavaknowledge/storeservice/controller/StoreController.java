package com.gainjavaknowledge.storeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gainjavaknowledge.storeservice.entity.StoreEntity;
import com.gainjavaknowledge.storeservice.service.StoreService;

@RestController
@RequestMapping("/store")
public class StoreController {

	@Autowired
	private StoreService storeService;
	
	@PostMapping("/save")
	public StoreEntity createStore(@RequestBody StoreEntity store) {
		return storeService.createStore(store);
	}
	
	@GetMapping("/{store-id}")
	public StoreEntity getStoreById(@PathVariable("store-id") Integer id) {
		return storeService.findById(id);
	}
	
}
