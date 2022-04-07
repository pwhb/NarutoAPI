package com.example.narutoapi.controller;

import java.util.List;
import com.example.narutoapi.model.Shinobi;
import com.example.narutoapi.repository.ShinobiRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/shinobi")
public class ShinobiController {
    private final ShinobiRepository shinobiRepository;

    ShinobiController(ShinobiRepository shinobiRepository) {
        this.shinobiRepository = shinobiRepository;

    }

    @GetMapping
    List<Shinobi> all(@RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {
        if (firstName != null) {
            return shinobiRepository.findAllByQuery(firstName);
        }
        return shinobiRepository.findAll();
    }

    @PostMapping
    Shinobi newShinobi(@RequestBody Shinobi newShinobi) {
        return shinobiRepository.insert(newShinobi);
    }

    @GetMapping("/{id}")
    Shinobi one(@PathVariable String id) {
        return shinobiRepository.findById(id).orElseThrow(() -> new ShinobiNotFoundException(id));
    }

    @PutMapping("/{id}")
    Shinobi update(@RequestBody Shinobi newShinobi, @PathVariable String id) {
        return shinobiRepository.findById(id).map(shinobi -> {
            if (newShinobi.getFirstName() != null) {
                shinobi.setFirstName(newShinobi.getFirstName());
            }
            if (newShinobi.getLastName() != null) {
                shinobi.setLastName(newShinobi.getLastName());
            }
            if (newShinobi.getTeam() != null) {
                shinobi.setTeam(newShinobi.getTeam());
            }
            if (newShinobi.getVillage() != null) {
                shinobi.setVillage(newShinobi.getVillage());
            }
            return shinobiRepository.save(shinobi);
        }).orElseThrow(() -> new ShinobiNotFoundException(id));
    }

    @DeleteMapping("/{id}")
    void deleteShinobi(@PathVariable String id) {
        shinobiRepository.deleteById(id);
    }
}
