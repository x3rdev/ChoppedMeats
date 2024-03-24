package com.github.x3r.choppedmeats;

import com.github.x3r.choppedmeats.common.registry.ItemRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ChoppedMeats.MOD_ID)
public class ChoppedMeats {

    public static final String MOD_ID = "chopped_meats";

    public ChoppedMeats() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemRegistry.ITEMS.register(modEventBus);
        ItemRegistry.ModItemTab.CREATIVE_MODE_TABS.register(modEventBus);
    }
}
