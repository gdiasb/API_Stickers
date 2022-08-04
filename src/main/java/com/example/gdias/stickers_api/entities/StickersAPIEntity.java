package com.example.gdias.stickers_api.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("StickersAPI")
public class StickersAPIEntity {

  @Id
  private String id;
  private String title;
  private String url;
  private Integer rankingPosition;
  
  public StickersAPIEntity(String title, String url, Integer rankingPosition) {
    this.title = title;
    this.url = url;
    this.rankingPosition = rankingPosition;
  }

  public String getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getUrl() {
    return url;
  }

  public Integer getRankingPosition() {
    return rankingPosition;
  }

  
  
}
