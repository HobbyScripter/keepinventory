package de.bbg.api;

import java.util.UUID;

public interface PlayerProfile {

    UUID getUniqueID();
    boolean hasKeepInventory();

    void setKeepInventory(boolean enabled);


}
