package com.example.gdias.stickers_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.gdias.stickers_api.entities.StickersAPIEntity;
import com.example.gdias.stickers_api.services.StickersAPIService;

@RestController
public class StickerAPIController {

  @Autowired
  private StickersAPIService service;

  @GetMapping("/")
  public String HelloWorld() {
    return "Oi";
  }

  @GetMapping("/languages")
  public List<StickersAPIEntity> FindAll() {
    return service.findAll();
  }

  @PostMapping("/languages")
  public StickersAPIEntity SaveLanguage(@RequestBody StickersAPIEntity requestBody) {
    return service.saveLanguage(requestBody);
  }

}
