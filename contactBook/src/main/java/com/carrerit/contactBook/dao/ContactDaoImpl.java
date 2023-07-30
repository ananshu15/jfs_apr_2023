package com.carrerit.contactBook.dao;

import com.carrerit.contactBook.domain.Contact;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.awt.image.Kernel;
import java.util.List;
@Repository
@RequiredArgsConstructor
public class ContactDaoImpl implements ContactDao{

    private final JdbcTemplate jdbcTemplate;

    private static final String ADD_CONTACT = "insert into contact (name, email, phone) values (?,?,?)";
    private static final String GET_CONTACTS = "select id, name, email, phone from contact";
    @Override
    public Contact insertContact(Contact contact) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            var ps = con.prepareStatement(ADD_CONTACT);
            ps.setString(1, contact.getName());
            ps.setString(2, contact.getEmail());
            ps.setString(3, contact.getPhone());
            return ps;
        },keyHolder);
        contact.setId(keyHolder.getKey().longValue());
        return contact;
    }

    @Override
    public List<Contact> getContacts() {
        return jdbcTemplate.query(GET_CONTACTS, (rs, rowNum) -> {
            var contact = new Contact();
            contact.setId(rs.getLong("id"));
            contact.setName(rs.getString("name"));
            contact.setEmail(rs.getString("email"));
            contact.setPhone(rs.getString("phone"));
            return contact;
        });
    }
}
