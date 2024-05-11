package whirlpool.warm_ice.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.registry.Registries;
import whirlpool.warm_ice.registry.WarmIceBlocks;
import whirlpool.warm_ice.block.WarmIceBlock;
import whirlpool.warm_ice.registry.WarmIceItems;

@Environment(EnvType.CLIENT)
public class WarmIceClient implements ClientModInitializer {
public void onInitializeClient() {
    BlockRenderLayerMap.INSTANCE.putBlock(WarmIceBlocks.WARM_ICE, RenderLayer.getTranslucent());
}
}