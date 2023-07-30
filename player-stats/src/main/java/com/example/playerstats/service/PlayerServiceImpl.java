package com.example.playerstats.service;

import com.example.playerstats.domain.Player;
import com.example.playerstats.dto.PlayerDto;
import com.example.playerstats.dao.PlayerDao;
import com.example.playerstats.exception.PlayerNotFoundException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.util.List;
@Service
@RequiredArgsConstructor
@Slf4j
public class PlayerServiceImpl implements PlayerService{

    private final PlayerDao playerDao;
    private final ObjectMapper objectMapper;
    @Override
    public PlayerDto addPlayer(PlayerDto playerDto) {
        Assert.notNull(playerDto, "PlayerDto can't be null");
        Assert.hasText(playerDto.getName(), "PlayerDto name can't be empty");
        Assert.hasText(playerDto.getRole(), "PlayerDto role can't be empty");
        Assert.hasText(playerDto.getTeam(), "PlayerDto team can't be empty");
        Assert.hasText(playerDto.getCountry(), "PlayerDto country can't be empty");
        Assert.isTrue(playerDto.getAmount() > 0, "PlayerDto amount can't be negative");

        Player player = objectMapper.convertValue(playerDto, Player.class);
        player = playerDao.insertPlayer(player);
        playerDto = objectMapper.convertValue(player, PlayerDto.class);
        log.info("Player added with id: {}", playerDto.getId());
        return playerDto;

    }

    @Override
    public List<PlayerDto> getPlayers() {
        List<Player> players = playerDao.selectPlayers();
        return objectMapper.convertValue(players, List.class);
    }

    @Override
    public PlayerDto getPlayerById(long id) {
        Player player = playerDao.getPlayerById(id);
        if(player != null) {
            log.info("Player found with id: {}", id);
            return objectMapper.convertValue(player, PlayerDto.class);
        }
        log.info("Player not found with id: {}", id);
        throw new PlayerNotFoundException("Player not found with id: " + id);
    }

    @Override
    public PlayerDto updatePlayer(PlayerDto playerDto) {
        Assert.notNull(playerDto, "PlayerDto can't be null");
        Assert.notNull(playerDto.getId(), "PlayerDto id can't be null");
        Assert.hasText(playerDto.getName(), "PlayerDto name can't be empty");
        Assert.hasText(playerDto.getRole(), "PlayerDto role can't be empty");
        Assert.hasText(playerDto.getTeam(), "PlayerDto team can't be empty");
        Assert.hasText(playerDto.getCountry(), "PlayerDto country can't be empty");
        Assert.isTrue(playerDto.getAmount() > 0, "PlayerDto amount can't be negative");

        Player player = playerDao.updatePlayer(objectMapper.convertValue(playerDto, Player.class));
        log.info("Player updated with id: {}", player.getId());
        return objectMapper.convertValue(player, PlayerDto.class);
    }

    @Override
    public Boolean deletePlayer(long id) {
        if (getById(id)) {
            log.info("Player deleted with id: {}", id);
            return playerDao.deletePlayer(id);
        }
        log.info("Player not found with id: {}", id);
        throw new PlayerNotFoundException("Player not found with id: " + id);
    }

    @Override
    public List<PlayerDto> search(String str) {
        if (StringUtils.hasText(str)) {
            List<Player> players = playerDao.search(str);
            return objectMapper.convertValue(players, new TypeReference<List<PlayerDto>>() {
            });
        }else {
            return getPlayers();
        }
    }

    @Override
    public List<PlayerDto> addPlayers(List<PlayerDto> players) {
        List<Player> playerList = objectMapper.convertValue(players, new TypeReference<List<Player>>() {
        });
        playerList = playerDao.insertPlayers(playerList);
        log.info("Total {} players added", playerList.size());
        return objectMapper.convertValue(playerList, new TypeReference<List<PlayerDto>>() {
        });
    }

    private boolean getById(long id) {
        Player player = playerDao.getPlayerById(id);
        return player != null;
    }
}
