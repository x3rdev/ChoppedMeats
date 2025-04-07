package com.github.x3r.choppedmeats;

import com.github.x3r.choppedmeats.common.registry.ItemRegistry;
import net.neoforged.bus.EventBus;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(ChoppedMeats.MOD_ID)
public class ChoppedMeats {

    public static final String MOD_ID = "chopped_meats";

    public ChoppedMeats(ModContainer container) {
        IEventBus bus = container.getEventBus();
        ItemRegistry.ITEMS.register(bus);
        ItemRegistry.ModItemTab.CREATIVE_MODE_TABS.register(bus);
    }
}
