package com.example.narutoapi.controller;

import java.util.List;

import com.example.narutoapi.model.Village;
import com.example.narutoapi.repository.VillageRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/village")
public class VillageController {
    private final VillageRepository repository;

    VillageController(VillageRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    List<Village> all() {
        return repository.findAll();
    }

    @PostMapping
    Village newShinobi(@RequestBody Village newVillage) {
        return repository.insert(newVillage);
    }

    @GetMapping("/{id}")
    Village one(@PathVariable String id) {
        return repository.findById(id).orElseThrow(() -> new ShinobiNotFoundException(id));
    }

    @DeleteMapping("/{id}")
    void deleteVillage(@PathVariable String id) {
        repository.deleteById(id);
    }
}
