package com.example.playerstats.dao;

import com.example.playerstats.domain.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
@RequiredArgsConstructor
public class PlayerDaoImpl implements PlayerDao{
    private final JdbcTemplate jdbcTemplate;
    private final String INSERT_PLAYER = "INSERT INTO player_details(name, team, country, role, amount) VALUES (?, ?, ?, ?, ?)";
    private final String SELECT_PLAYERS_BY_ID = "SELECT * FROM player_details WHERE id = ?";
    private final String SELECT_ALL_PLAYERS = "SELECT id, team, name, role, amount, country FROM player_details";
    private final String DELETE_PLAYER_BY_ID = "DELETE FROM player_details WHERE id = ?";
    private final String UPDATE_PLAYER_BY_ID = "UPDATE player_details SET name = ?, team = ?, country = ?, role = ?, amount = ? WHERE id = ?";
    private final String SEARCH_PLAYER = "SELECT * FROM player_details WHERE name LIKE ? OR team LIKE ? OR country LIKE ? OR role LIKE ? OR amount LIKE ?";
    @Override
    public Player insertPlayer(Player player) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            var ps = con.prepareStatement(INSERT_PLAYER, new String[]{"id"});
            ps.setString(1, player.getName());
            ps.setString(2, player.getTeam());
            ps.setString(3, player.getCountry());
            ps.setString(4, player.getRole());
            ps.setDouble(5, player.getAmount());
            return ps;
        }, keyHolder);
        long id = keyHolder.getKey().longValue();
        player.setId(id);
        return player;
    }

    @Override
    public List<Player> selectPlayers() {
        ;return jdbcTemplate.query(SELECT_ALL_PLAYERS, playerRowMapper);
    }

    @Override
    public Player getPlayerById(long id) {
          List<Player> list = jdbcTemplate.query(SELECT_PLAYERS_BY_ID, new Object[]{id}, playerRowMapper);
          if(list.size() == 1) {
              return list.get(0);
          }
            return null;
    }

    @Override
    public Player updatePlayer(Player player) {
        jdbcTemplate.update(UPDATE_PLAYER_BY_ID, player.getName(), player.getTeam(), player.getCountry(), player.getRole(), player.getAmount(), player.getId());
        return getPlayerById(player.getId());
    }

    @Override
    public Boolean deletePlayer(long id) {
           return jdbcTemplate.update(DELETE_PLAYER_BY_ID, id) != 0;
    }

    @Override
    public List<Player> search(String str) {
        String searchStr = "%" + str + "%";
        return jdbcTemplate.query(SEARCH_PLAYER, new Object[]{searchStr, searchStr, searchStr, searchStr, searchStr}, playerRowMapper);
    }

    @Override
    public List insertPlayers(List<Player> players) {
        List<Player> list = new ArrayList<>();
        for(Player player : players) {
            list.add(insertPlayer(player));
        }
        return list;
    }

    public RowMapper<Player> playerRowMapper = (rs, rowNum) -> {
        Player player = new Player();
        player.setId(rs.getLong("id"));
        player.setName(rs.getString("name"));
        player.setTeam(rs.getString("team"));
        player.setCountry(rs.getString("country"));
        player.setRole(rs.getString("role"));
        player.setAmount(rs.getDouble("amount"));
        return player;
    };
}
