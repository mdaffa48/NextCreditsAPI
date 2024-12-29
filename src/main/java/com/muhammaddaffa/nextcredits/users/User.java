package com.muhammaddaffa.nextcredits.users;

import java.util.UUID;

public class User {

    private final UUID uuid;

    private int credits;

    public User(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUniqueId() {
        return uuid;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void addCredits(int credits) {
        this.credits += credits;
    }

    public void removeCredits(int credits) {
        this.credits -= credits;
    }

}
