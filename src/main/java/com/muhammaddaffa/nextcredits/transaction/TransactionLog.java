package com.muhammaddaffa.nextcredits.transaction;

import java.util.UUID;

public record TransactionLog(
        UUID playerId,
        double credits,
        String description,
        long timestamp
) {

}
