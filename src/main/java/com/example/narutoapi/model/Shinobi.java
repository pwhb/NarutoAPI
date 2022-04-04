package com.example.narutoapi.model;

import java.util.Optional;

import com.example.narutoapi.repository.VillageRepository;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("shinobi")
public class Shinobi {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String team;
    private Optional<Village> village;

    private VillageRepository villageRepository;

    public Shinobi(String id, String firstName, String lastName, VillageRepository villageRepository) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.villageRepository = villageRepository;
    }

    public String getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTeam() {
        return this.team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Optional<Village> getVillage() {
        return this.village;
    }

    public void setVillage(String villageId) {
        this.village = this.villageRepository.findById(villageId);
    }

}
