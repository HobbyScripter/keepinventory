package de.bbg.logic;

import de.bbg.api.DeathContext;
import de.bbg.api.PlayerProfile;
import de.bbg.logging.CoreLogger;
import de.bbg.storage.StorageProvider;

import java.util.Optional;
import java.util.UUID;

public class KeepInventoryService {

    private final PlayerProfileRegistry registry;
    //private final StorageProvider storageProvider;
    private final CoreLogger logger;

    public KeepInventoryService(PlayerProfileRegistry registry, CoreLogger logger){
        this.registry = registry;
        this.logger = logger;
    }

    //public boolean shouldKeepInventory(UUID playerId, DeathContext context){
    //    return storageProvider.load(playerId).map(PlayerProfile::hasKeepInventory).orElse(false);
    //}


    public boolean shouldKeepInventory(UUID uuid, DeathContext context){
        PlayerProfile profile = registry.getOrLoad(uuid);
        boolean result = profile.hasKeepInventory();

        logger.info("KeepInventory-Check für " + uuid + ":"+ result);
        return result;
    }

}
