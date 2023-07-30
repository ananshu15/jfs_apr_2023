package com.carrerit.contactBook.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contact {

    private long id;
    private String name;
    private String email;
    private String mobile;

    public String getPhone() {
        return mobile;
    }

    public void setPhone(String phone) {
        this.mobile = phone;
    }


}
