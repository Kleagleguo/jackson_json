package com.bingkun;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Druitter
 */
public class Cat extends Animal {

  // if this is public, then both favoriteToy and favorite_toy will be serialized
  private String favorite;

  @JsonProperty("favoriteToy")
  public String getFavoriteToy() {
    return favorite;
  }

  @JsonProperty("favorite_toy")
  public void setFavorite(String favorite) {
    this.favorite = favorite;
  }

  @JsonProperty("favorite_toy")
  public String getFavorite() {
    return favorite;
  }

  @Override
  public String toString() {
    return "Cat{" +
        "favorite='" + favorite + '\'' +
        '}';
  }
}
