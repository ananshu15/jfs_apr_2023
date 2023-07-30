package com.example.playerstats.controller;

import com.example.playerstats.dao.PlayerDao;
import com.example.playerstats.dto.PlayerDto;
import com.example.playerstats.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/player")
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService playerService;

    @PostMapping("/add")
    public ResponseEntity<PlayerDto> addPlayer(@RequestBody PlayerDto playerDto) {
        return ResponseEntity.ok(playerService.addPlayer(playerDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlayerDto> getPlayerById(@PathVariable long id) {
        return ResponseEntity.ok(playerService.getPlayerById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<PlayerDto>> getPlayers() {
        return ResponseEntity.ok(playerService.getPlayers());
    }

    @PostMapping("/add/players")
    public ResponseEntity<List<PlayerDto>> addPlayers(@RequestBody List<PlayerDto> players) {
        return ResponseEntity.ok(playerService.addPlayers(players));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deletePlayer(@PathVariable long id) {
        return ResponseEntity.ok(playerService.deletePlayer(id));
    }

    @GetMapping("/search")
    public ResponseEntity<List<PlayerDto>> search(@RequestParam(name = "str", required = false) String str) {
        return ResponseEntity.ok(playerService.search(str));
    }

    @PutMapping("/update")
    public ResponseEntity<PlayerDto> updatePlayer(@RequestBody PlayerDto playerDto) {
        return ResponseEntity.ok(playerService.updatePlayer(playerDto));
    }
}
