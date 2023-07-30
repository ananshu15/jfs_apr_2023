package com.carrerit.contactBook.service;
import com.carrerit.contactBook.domain.Contact;

import com.carrerit.contactBook.dao.ContactDao;
import com.carrerit.contactBook.dto.ContactDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ContactServiceImpl implements ContactService{

    private final ContactDao contactDao;
    @Override
    public ContactDto addContact(ContactDto contactDto) {
        ObjectMapper objectMapper = new ObjectMapper();
        Contact contact = objectMapper.convertValue(contactDto, Contact.class);
        contact = contactDao.insertContact(contact);
        return objectMapper.convertValue(contact, ContactDto.class);
    }

    @Override
    public List<ContactDto> getContacts() {
        List<Contact> contacts = contactDao.getContacts();
        ObjectMapper objectMapper = new ObjectMapper();
           return contacts.stream().map((contact) ->{
                return objectMapper.convertValue(contact, ContactDto.class);
              }).toList();

    }
}
