package com.carrerit.contactBook.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactDto {

    private long id;
    private String name;
    private String email;
    private String mobile;
}
