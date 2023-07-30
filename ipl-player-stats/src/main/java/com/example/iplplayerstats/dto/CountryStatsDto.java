package com.example.iplplayerstats.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CountryStatsDto {

    private String countryName;
    private long count;
}
