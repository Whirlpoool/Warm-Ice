package whirlpool.warm_ice.registry;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import whirlpool.warm_ice.WarmIce;
import whirlpool.warm_ice.block.WarmIceBlock;

import static whirlpool.warm_ice.registry.WarmIceBlocks.WARM_ICE;

public class WarmIceItems implements ModInitializer {

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier("warm_ice", "warm_ice"), new BlockItem(WARM_ICE, new FabricItemSettings()));
    }
}