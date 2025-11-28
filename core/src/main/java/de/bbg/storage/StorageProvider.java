package de.bbg.storage;

import de.bbg.api.PlayerProfile;

import java.util.Optional;
import java.util.UUID;

public interface StorageProvider {

    Optional<PlayerProfile> load(UUID uuid);
    void save(PlayerProfile profile);

}
