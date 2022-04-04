package com.example.narutoapi.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("village")
public class Village {
    @Id
    private String id;
    private String name;
    private String villageNameMeaning;
    // private List<Shinobi> hokages;

    public Village(String id, String name, String villageNameMeaning) {
        this.id = id;
        this.name = name;
        this.villageNameMeaning = villageNameMeaning;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVillageNameMeaning() {
        return this.villageNameMeaning;
    }

    public void setVillageNameMeaning(String villageNameMeaning) {
        this.villageNameMeaning = villageNameMeaning;
    }
}
