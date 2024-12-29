package com.muhammaddaffa.nextcredits;

import org.bukkit.entity.Player;

import java.util.UUID;

public interface NextCreditsAPI {

    double getCredits(Player player);

    double getCredits(UUID uuid);

    void addCredits(Player player, double credits);

    void addCredits(UUID uuid, double credits);

    void removeCredits(Player player, double credits);

    void removeCredits(UUID uuid, double credits);

    void setCredits(Player player, double credits);

    void setCredits(UUID uuid, double credits);

}
