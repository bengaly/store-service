package com.gainjavaknowledge.storeservice.service;

import com.gainjavaknowledge.storeservice.entity.StoreEntity;

public interface StoreService {

	StoreEntity createStore(StoreEntity store);

	StoreEntity findById(Integer id);

}
