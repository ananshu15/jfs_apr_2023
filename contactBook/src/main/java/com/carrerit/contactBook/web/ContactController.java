package com.carrerit.contactBook.web;

import com.carrerit.contactBook.dto.ContactDto;
import com.carrerit.contactBook.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
@RequiredArgsConstructor
public class ContactController {


    private final ContactService contactService;

    @PostMapping("/add")
    public ResponseEntity<ContactDto> addContact(@RequestBody ContactDto contactDto) {
        return ResponseEntity.ok(contactService.addContact(contactDto));
    }

    @GetMapping("/all")
    public ResponseEntity<List<ContactDto>> getContact() {
        return ResponseEntity.ok(contactService.getContacts());
    }
}
