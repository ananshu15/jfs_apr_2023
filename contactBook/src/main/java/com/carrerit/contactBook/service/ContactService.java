package com.carrerit.contactBook.service;

import com.carrerit.contactBook.dto.ContactDto;

import java.util.List;

public interface ContactService {

    ContactDto addContact(ContactDto contactDto);
    List<ContactDto> getContacts();
}
