package com.bingkun;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Bar {

  public static void main(String args[]) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    Zoo zoo = mapper.readValue(new File("poly.json"), Zoo.class);
    System.out.println(zoo);
    System.out.println(mapper.writeValueAsString(zoo));

//    Cat cat = new Cat();
//    cat.name = "kitty";
//    cat.setFavorite("bingkun");
//    System.out.println(mapper.writeValueAsString(cat));

    //Animal dog = mapper.readValue(new File("dog.json"), Animal.class);
//    Dog dog = mapper.readValue(new File("dog.json"), Dog.class);
//    System.out.println(mapper.writeValueAsString(dog));
  }
}
