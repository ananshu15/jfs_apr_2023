package com.example.playerstats.dao;
import com.example.playerstats.domain.Player;

import java.util.List;

public interface PlayerDao {

    Player insertPlayer(Player player);
    List<Player> selectPlayers();
    Player getPlayerById(long id);
    Player updatePlayer(Player player);
    Boolean deletePlayer(long id);
    List<Player> search(String str);
    List<Player> insertPlayers(List<Player> players);

}
