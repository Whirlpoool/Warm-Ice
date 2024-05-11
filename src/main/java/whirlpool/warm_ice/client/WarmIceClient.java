package whirlpool.warm_ice.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import whirlpool.warm_ice.registry.BlockRegistry;

@Environment(EnvType.CLIENT)
public class WarmIceClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.WARM_ICE, RenderLayer.getTranslucent());
    }
}
