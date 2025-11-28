package de.bbg;

import de.bbg.logging.CoreLogger;
import de.bbg.logic.KeepInventoryService;
import de.bbg.logic.PlayerProfileRegistry;
import de.bbg.storage.StorageProvider;

public class CoreContext {

    private final PlayerProfileRegistry registry;
    private final KeepInventoryService service;
    private final CoreLogger logger;


    public CoreContext(StorageProvider storage,CoreLogger logger){
        this.logger = logger;
        this.registry = new PlayerProfileRegistry(storage,logger);
        this.service = new KeepInventoryService(registry,logger);
    }

    public KeepInventoryService getService() {
        return service;
    }

    public PlayerProfileRegistry getRegistry() {
        return registry;
    }

    public CoreLogger getLogger() {
        return logger;
    }
}
