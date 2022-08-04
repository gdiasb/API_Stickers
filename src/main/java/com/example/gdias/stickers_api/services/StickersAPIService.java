package com.example.gdias.stickers_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.gdias.stickers_api.entities.StickersAPIEntity;
import com.example.gdias.stickers_api.repositories.StickersAPIRepository;

@Service
public class StickersAPIService {
  
  @Autowired
  private StickersAPIRepository repository;

  public List<StickersAPIEntity> findAll() {
    return repository.findAll();
  }

  public StickersAPIEntity saveLanguage(@RequestBody StickersAPIEntity requestBody) {
    return repository.save(requestBody);

  }
}