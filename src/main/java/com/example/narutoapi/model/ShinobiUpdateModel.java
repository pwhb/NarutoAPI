package com.example.narutoapi.model;

import java.util.Optional;

import com.example.narutoapi.repository.VillageRepository;

import org.springframework.data.annotation.Id;

public class ShinobiUpdateModel {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String team;
    private String villageId;


    public ShinobiUpdateModel(String id, String firstName, String lastName, String team, String villageId) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.team = team;
        this.villageId = villageId;
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

    public String getVillageId() {
        return this.villageId;
    }

    public void setVillageId(String villageId) {
        this.villageId = villageId;
    }
}
