package com.muhammaddaffa.nextcredits.events;

import org.bukkit.entity.Player;

public class CreditReceiveEvent extends CreditEvent {

    public CreditReceiveEvent(Player who, double amount) {
        super(who, amount);
    }

}
