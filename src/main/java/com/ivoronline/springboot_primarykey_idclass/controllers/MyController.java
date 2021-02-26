package com.ivoronline.springboot_primarykey_idclass.controllers;

import com.ivoronline.springboot_primarykey_idclass.entities.PersonEntity;
import com.ivoronline.springboot_primarykey_idclass.entities.PersonId;
import com.ivoronline.springboot_primarykey_idclass.respositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

  @Autowired
  PersonRepository personRepository;

  //===================================================================
  // ADD BOOKS
  //===================================================================
  @ResponseBody
  @RequestMapping("/AddPersons")
  public String addPersons() {

    //CREATE BOOK1
    PersonEntity personEntity1      = new PersonEntity();
                 personEntity1.name = "John";
                 personEntity1.age  = 20;
                 personEntity1.book = "Book about dogs";

    //CREATE BOOK2
    PersonEntity personEntity2      = new PersonEntity();
                 personEntity2.name = "John";
                 personEntity2.age  = 50;
                 personEntity2.book = "Book about cats";

    //STORE BOOKS
    personRepository.save(personEntity1);
    personRepository.save(personEntity2);

    //RETURN SOMETHING TO BROWSER
    return "Persons added to DB";

  }

  //===================================================================
  // GET BOOK
  //===================================================================
  @ResponseBody
  @RequestMapping("/GetPerson")
  public PersonEntity getPerson() {
    PersonEntity personEntity = personRepository.findById(new PersonId("John", 20)).get();
    return personEntity;
  }

}
