package whirlpool.warm_ice.registry;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.IceBlock;
import net.minecraft.item.PickaxeItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import whirlpool.warm_ice.block.WarmIceBlock;

import static net.minecraft.block.MapColor.BLUE;

public class WarmIceBlocks implements ModInitializer {
    public static final Block WARM_ICE = new WarmIceBlock(FabricBlockSettings.create().strength(0.5f).sounds(BlockSoundGroup.GLASS).nonOpaque());

    public void onInitialize() {
        Registry.register(Registries.BLOCK, new Identifier("warm_ice", "warm_ice"), WARM_ICE);
    }
}