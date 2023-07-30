package com.example.iplplayerstats.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayerDto {

        private long id;
        private String name;
        private String team;
        private String role;
        private String country;
        private double amount;
}
