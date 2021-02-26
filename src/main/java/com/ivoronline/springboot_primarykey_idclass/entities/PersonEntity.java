package com.ivoronline.springboot_primarykey_idclass.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(PersonId.class)
public class PersonEntity {

  //COMPOSITE PRIMARY KEY
  @Id public String name;
  @Id public Integer age;

  //OTHER PROPERTIES
  public String book;

}
