package com.podstaw.od.java.rybicki.marcin.null_avoid.football;

import java.util.Optional;

public class Stadium {

    private Chair chair;

    public Stadium(Chair chair) {
        this.chair = chair;
    }

    public Chair getChair() {
        return chair;
    }

    public Optional<Chair> getChairOptional() {
        return Optional.ofNullable(chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    @Override
    public String toString() {
        return "Stadium{" +
                "chair=" + chair +
                '}';
    }
}
