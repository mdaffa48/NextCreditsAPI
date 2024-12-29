package com.muhammaddaffa.nextcredits;

import org.bukkit.entity.Player;

import java.util.UUID;

public interface NextCreditsAPI {

    int getCredits(Player player);

    int getCredits(UUID uuid);

    void addCredits(Player player);

    void addCredits(UUID uuid);

    void removeCredits(Player player);

    void removeCredits(UUID uuid);

    void setCredits(Player player);

    void setCredits(UUID uuid);

}
