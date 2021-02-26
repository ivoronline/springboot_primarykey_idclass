package com.ivoronline.springboot_primarykey_idclass.entities;

import java.io.Serializable;

public class PersonId implements Serializable {

  //COMPOSITE PRIMARY KEY
  private String name;
  private Integer age;

  //REQUIERED NO ARGS CONSTRUCTOR
  PersonId() {}

  //CONSTRUCTOR FOR findById(BookId)
  public PersonId(String name, Integer age) {
    this.name = name;
    this.age  = age;
  }

}
