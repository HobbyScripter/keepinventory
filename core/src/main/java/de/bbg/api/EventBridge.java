package de.bbg.api;

import java.util.UUID;

public interface EventBridge {
    void onnPlayerDeath(UUID playerId, DeathContext context);
}
