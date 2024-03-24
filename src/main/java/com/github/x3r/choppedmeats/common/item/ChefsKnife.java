package com.github.x3r.choppedmeats.common.item;

import net.minecraft.util.RandomSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ChefsKnife extends Item {
    static RandomSource source = RandomSource.create();
    public ChefsKnife(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        boolean stackDestroyed = itemStack.hurt(1, source, null);
        ItemStack result = itemStack.copy();
        return !stackDestroyed ? result : ItemStack.EMPTY;
    }
}
