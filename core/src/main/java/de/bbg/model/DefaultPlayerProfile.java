package de.bbg.model;

import de.bbg.api.PlayerProfile;

import java.util.UUID;

public class DefaultPlayerProfile implements PlayerProfile {

    private final UUID uuid;
    private boolean keepInventory;

    public DefaultPlayerProfile(UUID uuid){
        this.uuid = uuid;
    }

    @Override
    public UUID getUniqueID() {
        return uuid;
    }

    @Override
    public boolean hasKeepInventory() {
        return keepInventory;
    }

    @Override
    public void setKeepInventory(boolean enabled) {
        this.keepInventory = enabled;
    }
}
