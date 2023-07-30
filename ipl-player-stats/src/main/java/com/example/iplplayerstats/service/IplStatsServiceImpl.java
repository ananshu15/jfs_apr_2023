package com.example.iplplayerstats.service;

import com.example.iplplayerstats.dao.IplStatsRepo;
import com.example.iplplayerstats.domain.Player;
import com.example.iplplayerstats.dto.CountryStatsDto;
import com.example.iplplayerstats.dto.PlayerDto;
import com.example.iplplayerstats.dto.RoleStatsDto;
import com.example.iplplayerstats.dto.TeamStatsDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
@Service
@Slf4j
@RequiredArgsConstructor
public class IplStatsServiceImpl implements IplStatsService{

    private final IplStatsRepo iplStatsRepo;
    private final ObjectMapper objectMapper;
    @Override
    public List<String> getTeamNames() {
        List<String> teamNames = iplStatsRepo.findTeamNames();
        log.info("Total Team Count is : {}", getTeamNames().size());
        return teamNames;
    }

    @Override
    public List<PlayerDto> getPlayersByTeam(String teamName) {
        Assert.notNull(teamName, "Team Name can not be null");
        log.info("Team Name is : {}", teamName);
        List<Player> player = iplStatsRepo.findPlayersByTeam(teamName);
        List<PlayerDto> playerDtos = player.stream().map(p -> objectMapper.convertValue(p, PlayerDto.class)).toList();
        log.info("Total Player Count is : {}", playerDtos.size());
        return playerDtos;
    }

    @Override
    public List<TeamStatsDto> getTeamStats() {
        return iplStatsRepo.findTeamStats();
    }

    @Override
    public List<RoleStatsDto> getRoleStats() {
        return iplStatsRepo.findRoleStats();
    }

    @Override
    public List<CountryStatsDto> getCountryStats() {
        return iplStatsRepo.findCountryStats();
    }
}
