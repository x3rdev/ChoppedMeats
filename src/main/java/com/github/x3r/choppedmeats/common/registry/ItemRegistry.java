package com.github.x3r.choppedmeats.common.registry;

import com.github.x3r.choppedmeats.ChoppedMeats;
import com.github.x3r.choppedmeats.common.item.ChefsKnife;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ChoppedMeats.MOD_ID);

    public static final RegistryObject<Item> IRON_CHEFS_KNIFE = ITEMS.register("iron_chefs_knife", () -> new ChefsKnife(
            new Item.Properties().durability(32)));
    public static final RegistryObject<Item> DIAMOND_CHEFS_KNIFE = ITEMS.register("diamond_chefs_knife", () -> new ChefsKnife(
            new Item.Properties().durability(224)));
    public static final RegistryObject<Item> CHOPPED_BEEF = ITEMS.register("chopped_beef", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHOPPED_PORKCHOP = ITEMS.register("chopped_porkchop", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHOPPED_CHICKEN = ITEMS.register("chopped_chicken", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHOPPED_MUTTON = ITEMS.register("chopped_mutton", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHOPPED_RABBIT = ITEMS.register("chopped_rabbit", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FILLETED_COD = ITEMS.register("filleted_cod", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FILLETED_SALMON = ITEMS.register("filleted_salmon", () -> new Item(new Item.Properties()));
    public static class ModItemTab {

        public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChoppedMeats.MOD_ID);

        public static final RegistryObject<CreativeModeTab> CHOPPED_MEATS_ITEM_TAB = CREATIVE_MODE_TABS.register("main", () -> CreativeModeTab.builder()
                .icon(() -> ItemRegistry.IRON_CHEFS_KNIFE.get().getDefaultInstance())
                .title(Component.translatable("itemGroup." + ChoppedMeats.MOD_ID))
                .displayItems((displayParameters, output) -> ItemRegistry.ITEMS.getEntries().forEach(itemRegistryObject -> output.accept(itemRegistryObject.get())))
                .build());
    }
}
