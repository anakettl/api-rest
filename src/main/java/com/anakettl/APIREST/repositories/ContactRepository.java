package com.anakettl.APIREST.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anakettl.APIREST.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{

}
