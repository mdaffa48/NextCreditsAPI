package com.muhammaddaffa.nextcredits.users;

import java.util.UUID;

public class User {

    private final UUID uuid;

    private double credits;

    public User(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUniqueId() {
        return uuid;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public void addCredits(double credits) {
        this.credits += credits;
    }

    public void removeCredits(double credits) {
        this.credits -= credits;
    }

}
