package com.carrerit.contactBook.dao;

import com.carrerit.contactBook.domain.Contact;

import java.util.List;

public interface ContactDao {

    Contact insertContact(Contact contact);
    List<Contact> getContacts();
}
