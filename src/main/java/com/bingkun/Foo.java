package com.bingkun;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class Foo {

  public static void main(String args[]) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    Collection<Animal> animals = mapper.readValue(new File("test.json"), new TypeReference<Collection<Animal>>() {});
    System.out.println(animals);

    Zoo zoo = mapper.readValue(new File("zoo.json"), Zoo.class);
    System.out.println(zoo);
  }
}
