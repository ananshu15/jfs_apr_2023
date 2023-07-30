package com.example.iplplayerstats.dao;

import com.example.iplplayerstats.domain.Player;
import com.example.iplplayerstats.dto.CountryStatsDto;
import com.example.iplplayerstats.dto.RoleStatsDto;
import com.example.iplplayerstats.dto.TeamStatsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IplStatsRepo extends JpaRepository<Player, Long> {

    @Query("select distinct p.team from player p")
    List<String> findTeamNames();

    List<Player> findPlayersByTeam(String team);

    @Query("select new com.example.iplplayerstats.dto.TeamStatsDto(p.team, sum(p.amount)) from player p group by p.team")
    List<TeamStatsDto> findTeamStats();

    @Query("select new com.example.iplplayerstats.dto.RoleStatsDto(p.role, sum(p.amount)) from player p group by p.role")
    List<RoleStatsDto> findRoleStats();

    @Query("select new com.example.iplplayerstats.dto.CountryStatsDto(p.country, sum(p.amount)) from player p group by p.country")
    List<CountryStatsDto> findCountryStats();
}
