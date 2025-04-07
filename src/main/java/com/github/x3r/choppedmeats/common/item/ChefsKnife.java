package com.github.x3r.choppedmeats.common.item;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

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
    public void onCraftedBy(ItemStack stack, Level level, Player player) {
        super.onCraftedBy(stack, level, player);
        if(!level.isClientSide()) {
            stack.hurtAndBreak(1, ((ServerLevel) level), ((ServerPlayer) player), item -> {});
        }
    }

}
