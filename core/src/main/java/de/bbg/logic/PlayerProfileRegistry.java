package de.bbg.logic;

import de.bbg.api.PlayerProfile;
import de.bbg.storage.StorageProvider;
import de.bbg.logging.CoreLogger;
import de.bbg.model.DefaultPlayerProfile;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class PlayerProfileRegistry {

    private final Map<UUID, PlayerProfile> cache = new ConcurrentHashMap<>();
    private final StorageProvider storage;
    private final CoreLogger logger;

    public PlayerProfileRegistry(StorageProvider storage,CoreLogger logger){
        this.logger = logger;
        this.storage = storage;
    }

    public PlayerProfile getOrLoad(UUID uuid){
        return cache.computeIfAbsent(uuid, id -> storage.load(id).orElseGet(() -> new DefaultPlayerProfile(id)));
    }

    public void save(UUID uuid){
        PlayerProfile profile = cache.get(uuid);
        if (profile != null){
            storage.save(profile);
        }
    }
}
