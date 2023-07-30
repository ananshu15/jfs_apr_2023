package com.example.playerstats.service;

import com.example.playerstats.domain.Player;
import com.example.playerstats.dto.PlayerDto;

import java.util.List;

public interface PlayerService {

    PlayerDto addPlayer(PlayerDto playerDto);
    List<PlayerDto> getPlayers();
    PlayerDto getPlayerById(long id);
    PlayerDto updatePlayer(PlayerDto playerDto);
    Boolean deletePlayer(long id);
    List<PlayerDto> search(String str);
    List<PlayerDto> addPlayers(List<PlayerDto> players);
}
