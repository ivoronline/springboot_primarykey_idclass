package com.ivoronline.springboot_primarykey_idclass.respositories;

import com.ivoronline.springboot_primarykey_idclass.entities.PersonEntity;
import com.ivoronline.springboot_primarykey_idclass.entities.PersonId;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonEntity, PersonId> { }

