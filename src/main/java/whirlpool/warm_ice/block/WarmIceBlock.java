package whirlpool.warm_ice.block;

import net.minecraft.block.IceBlock;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContext;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.loot.context.LootContextParameters;

import java.util.Collections;
import java.util.List;

public class WarmIceBlock extends IceBlock {

    public WarmIceBlock(Settings settings) {
        super(settings);
    }

    @Override
    public List<ItemStack> getDroppedStacks(BlockState state, LootContext.Builder builder) {
        if (this.isSilkTouch(builder)) {
            return Collections.singletonList(new ItemStack(this));
        } else {
            return Collections.singletonList(ItemStack.EMPTY);
        }
    }

    private boolean isSilkTouch(LootContext.Builder builder) {
        return EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, builder.get(LootContextParameters.TOOL)) > 0;
    }
}
