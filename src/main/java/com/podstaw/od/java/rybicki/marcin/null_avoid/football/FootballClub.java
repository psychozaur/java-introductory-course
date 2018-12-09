package com.podstaw.od.java.rybicki.marcin.null_avoid.football;

import java.util.Optional;

public class FootballClub {

    private Stadium stadium;

    public FootballClub(Stadium stadium) {
        this.stadium = stadium;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public Optional<Stadium> getStadiumOptional() {
        return Optional.ofNullable(stadium);
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    @Override
    public String toString() {
        return "FootballClub{" +
                "stadium=" + stadium +
                '}';
    }
}
