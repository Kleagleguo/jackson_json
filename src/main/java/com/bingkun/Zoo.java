package com.bingkun;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collection;

public class Zoo {

  private Collection<Animal> animals;

  @JsonCreator
  public Zoo(@JsonProperty("animals") Collection<Animal> animals) {
    this.animals = animals;
  }

  @JsonProperty
  public Collection<Animal> getAnimals() {
    return animals;
  }

  @Override
  public String toString() {
    return "Zoo{" +
        "animals=" + animals +
        '}';
  }
}
