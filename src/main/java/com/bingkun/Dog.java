package com.bingkun;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Druitter
 */
public class Dog extends Animal {

  private final String breed;
  private final String leashColor;

  @JsonCreator
  public Dog(@JsonProperty("breed") String breed, @JsonProperty("leash_color") String leashColor) {
    this.breed = breed;
    this.leashColor = leashColor;
  }

  @JsonProperty
  public String getBreed() {
    return breed;
  }

  @JsonProperty("leash_color")
  public String getLeashColor() {
    return leashColor;
  }

  @Override
  public String toString() {
    return "Dog{" +
        "breed='" + breed + '\'' +
        ", leashColor='" + leashColor + '\'' +
        '}';
  }
}
