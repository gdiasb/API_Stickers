package com.example.gdias.stickers_api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.gdias.stickers_api.entities.StickersAPIEntity;

public interface StickersAPIRepository extends MongoRepository<StickersAPIEntity, String> {
  
}
