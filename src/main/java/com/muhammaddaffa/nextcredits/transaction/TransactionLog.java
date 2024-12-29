package com.muhammaddaffa.nextcredits.transaction;

import java.util.UUID;

public record TransactionLog(
        UUID playerId,
        int credits,
        String description,
        long timestamp
) {

}
