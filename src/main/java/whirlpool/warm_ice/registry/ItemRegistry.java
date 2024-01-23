package whirlpool.warm_ice.registry;

import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class ItemRegistry {

    public static void init() {
        BlockItem register = Registry.register(Registry.ITEM, new Identifier("warm_ice", "warm_ice"), new BlockItem(BlockRegistry.WARM_ICE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}