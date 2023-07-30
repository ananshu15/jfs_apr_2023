package com.example.iplplayerstats.service;

import com.example.iplplayerstats.dto.CountryStatsDto;
import com.example.iplplayerstats.dto.PlayerDto;
import com.example.iplplayerstats.dto.RoleStatsDto;
import com.example.iplplayerstats.dto.TeamStatsDto;

import java.util.List;

public interface IplStatsService {

    List<String> getTeamNames();

    List<PlayerDto> getPlayersByTeam(String teamName);

    List<TeamStatsDto> getTeamStats();

    List<RoleStatsDto> getRoleStats();

    List<CountryStatsDto> getCountryStats();


}
