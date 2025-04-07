package com.github.x3r.choppedmeats.common.item;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.RandomSource;
import net.minecraft.util.ThreadingDetector;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.server.ServerLifecycleHooks;

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
        int newDurability = itemStack.getDamageValue()+1;
        if(newDurability > itemStack.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        itemStack.setDamageValue(newDurability);
        return itemStack.copy();
    }
}
