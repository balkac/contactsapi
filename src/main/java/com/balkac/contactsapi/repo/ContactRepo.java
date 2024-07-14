package com.balkac.contactsapi.repo;

import com.balkac.contactsapi.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContactRepo extends JpaRepository<Contact, String> {

    Optional<Contact> findById(String id);
}
