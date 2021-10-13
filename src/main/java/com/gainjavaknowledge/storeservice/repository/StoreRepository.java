package com.gainjavaknowledge.storeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gainjavaknowledge.storeservice.entity.StoreEntity;

public interface StoreRepository extends JpaRepository<StoreEntity, Integer> {

}
