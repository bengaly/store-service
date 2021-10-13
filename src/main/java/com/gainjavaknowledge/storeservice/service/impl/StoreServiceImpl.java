package com.gainjavaknowledge.storeservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gainjavaknowledge.storeservice.entity.StoreEntity;
import com.gainjavaknowledge.storeservice.repository.StoreRepository;
import com.gainjavaknowledge.storeservice.service.StoreService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StoreServiceImpl implements StoreService{

	@Autowired
	private StoreRepository storeRepository;
	
	@Override
	public StoreEntity createStore(StoreEntity store) {
		log.info("creating store....");
		return storeRepository.save(store);
	}

	@Override
	public StoreEntity findById(Integer id) {
		log.info("finding the store by id : {}, ",id);
		return storeRepository.findById(id).get();
	}

}
