package com.kafka.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "wikidata_changes")

public class WikiDataChange {

    public WikiDataChange() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;


    private String type;

    private String title;

    private Long timestamp;
    private String user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
}