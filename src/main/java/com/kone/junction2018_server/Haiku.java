package com.kone.junction2018_server;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Haiku {
    @JsonProperty("text")
    private String text;
    @JsonProperty("latitude")
    private double latitude;
    @JsonProperty("longitude")
    private double longitude;
    @JsonProperty("mood")
    private int mood;

    public Haiku(String text, double latitude, double longitude, int mood) {
        this.text = text;
        this.longitude = longitude;
        this.latitude = latitude;
        this.mood = mood;
    }

    public Haiku() {
    }

    @Override
    public String toString() {
    return "{\"latitude\": " + latitude + ", \"longitude\": " + longitude + ", \"message\": "
            + text + ", \"mood\": " + mood + "}";

    }
}
