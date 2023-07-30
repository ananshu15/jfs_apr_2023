package com.example.iplplayerstats.controller;

import com.example.iplplayerstats.dto.CountryStatsDto;
import com.example.iplplayerstats.dto.PlayerDto;
import com.example.iplplayerstats.dto.RoleStatsDto;
import com.example.iplplayerstats.dto.TeamStatsDto;
import com.example.iplplayerstats.service.IplStatsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class IplController {

    private final IplStatsService iplStatsService;

@GetMapping("/team/names")
    public ResponseEntity<List<String>> getTeamNames() {
        return ResponseEntity.ok(iplStatsService.getTeamNames());
    }

    @GetMapping("/players/{team}")
    public ResponseEntity<List<PlayerDto>> getPlayersByTeam(@PathVariable("team") String teamName) {
        return ResponseEntity.ok(iplStatsService.getPlayersByTeam(teamName));
    }
@GetMapping("/team/stats")
    public ResponseEntity<List<TeamStatsDto>> getTeamStats() {
        return ResponseEntity.ok(iplStatsService.getTeamStats());
    }

    @GetMapping("/role/stats")
    public ResponseEntity<List<RoleStatsDto>> getRoleStats() {
        return ResponseEntity.ok(iplStatsService.getRoleStats());
    }

    @GetMapping("/country/stats")
    public ResponseEntity<List<CountryStatsDto>> getCountryStats() {
        return ResponseEntity.ok(iplStatsService.getCountryStats());
    }
}
