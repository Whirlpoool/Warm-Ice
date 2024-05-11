package whirlpool.warm_ice;

import net.fabricmc.api.ModInitializer;
import whirlpool.warm_ice.registry.WarmIceBlocks;
import whirlpool.warm_ice.registry.WarmIceItems;

public class WarmIce implements ModInitializer {

    @Override
    public void onInitialize() {
        new WarmIceBlocks().onInitialize();
        new WarmIceItems().onInitialize();
    }
}