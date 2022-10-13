package com.example.Admin.repositories;


import com.example.Admin.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository <Contact,Integer> {
}
