package com.bingkun;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

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
