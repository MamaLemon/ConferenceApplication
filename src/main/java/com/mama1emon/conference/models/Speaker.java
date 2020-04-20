package com.mama1emon.conference.models;

import javax.persistence.*;
import javax.swing.*;
import java.util.List;

@Entity(name = "speakers")
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long speaker_id;
    String first_name;
    String last_name;
    Spring title;
    Spring company;
    Spring speaker_bio;

    @ManyToMany(mappedBy = "speakers")
    List<Session> sessions;

    public Speaker() {
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    public Long getSpeaker_id() {
        return speaker_id;
    }

    public void setSpeaker_id(Long speaker_id) {
        this.speaker_id = speaker_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Spring getTitle() {
        return title;
    }

    public void setTitle(Spring title) {
        this.title = title;
    }

    public Spring getCompany() {
        return company;
    }

    public void setCompany(Spring company) {
        this.company = company;
    }

    public Spring getSpeaker_bio() {
        return speaker_bio;
    }

    public void setSpeaker_bio(Spring speaker_bio) {
        this.speaker_bio = speaker_bio;
    }
}
