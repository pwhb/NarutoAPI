package com.example.narutoapi.controller;

import java.util.List;
import com.example.narutoapi.model.Shinobi;
import com.example.narutoapi.repository.ShinobiRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/shinobi")
public class ShinobiController {
    private final ShinobiRepository repository;

    ShinobiController(ShinobiRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    List<Shinobi> all(@RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {
        if (firstName != null) {
            return repository.findAllByQuery(firstName);
        }
        return repository.findAll();
    }

    @PostMapping
    Shinobi newShinobi(@RequestBody Shinobi newShinobi) {
        return repository.insert(newShinobi);
    }

    @GetMapping("/{id}")
    Shinobi one(@PathVariable String id) {
        return repository.findById(id).orElseThrow(() -> new ShinobiNotFoundException(id));
    }

    @DeleteMapping("/{id}")
    void deleteShinobi(@PathVariable String id) {
        repository.deleteById(id);
    }
}
