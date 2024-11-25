package com.contact.contact.repositories;

import java.util.Optional;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contact.contact.models.Contact;
import com.contact.contact.models.User;


@Repository
public interface ContactRepo extends JpaRepository<Contact, Integer> {

    Optional<List<Contact>> findByUser(User pUser);

    Optional<Contact> findByContactIdAndUserUserId(int contact_id, int userId);

    Optional<Contact> findByPhone(String phone);

    Page<Contact> findAllByUserUserId(int user_id, Pageable pageable);

    Optional<Contact> findByPhoneAndUserUserId(String phone, int userId);

}
