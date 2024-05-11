package whirlpool.warm_ice.registry;

import net.minecraft.block.Block;
import net.minecraft.block.IceBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import whirlpool.warm_ice.block.WarmIceBlock;

public class BlockRegistry {

    public static final Block WARM_ICE = new WarmIceBlock(FabricBlockSettings.of(Material.ICE).strength(0.5f).sounds(BlockSoundGroup.GLASS).nonOpaque());

    public static void init() {
        Registry.register(Registry.BLOCK, new Identifier("warm_ice", "warm_ice"), WARM_ICE);
    }
}