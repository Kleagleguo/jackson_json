package com.bingkun;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonTypeInfo(
//    use = JsonTypeInfo.Id.NAME,
//    include = JsonTypeInfo.As.PROPERTY,
//    property = "type"
//)
//@JsonSubTypes({@Type(value = Cat.class, name = "cat"),
//               @Type(value = Dog.class, name = "dog")})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Animal {

  public String name;

}
