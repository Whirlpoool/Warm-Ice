package whirlpool.warm_ice;

import net.fabricmc.api.ModInitializer;
import whirlpool.warm_ice.registry.BlockRegistry;
import whirlpool.warm_ice.registry.ItemRegistry;

public class WarmIce implements ModInitializer {

    @Override
    public void onInitialize() {
        BlockRegistry.init();
        ItemRegistry.init();
    }
}
