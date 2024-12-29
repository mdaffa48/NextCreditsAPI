package com.muhammaddaffa.nextcredits;

import org.bukkit.entity.Player;

import java.util.UUID;

public interface NextCreditsAPI {

    int getCredits(Player player);

    int getCredits(UUID uuid);

    void addCredits(Player player, int credits);

    void addCredits(UUID uuid, int credits);

    void removeCredits(Player player, int credits);

    void removeCredits(UUID uuid, int credits);

    void setCredits(Player player, int credits);

    void setCredits(UUID uuid, int credits);

}
