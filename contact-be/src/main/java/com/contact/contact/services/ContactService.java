package com.contact.contact.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.contact.contact.models.Contact;
import com.contact.contact.models.Response;
import com.contact.contact.models.User;

@Service
public interface ContactService {
    public Response updateContact(Contact contact, int contact_id, User pUser);
    public Contact deleteContact(int contact_id);
    public Response saveContact(Contact contact);
    public List<Contact> getAllContactOfAUser(User pUser) ;
}
