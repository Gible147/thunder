package com.gible147.thunder;

import com.gible147.thunder.registry.ModBlocks;
import com.gible147.thunder.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Thunder implements ModInitializer {

    public static final String MOD_ID = "thunder";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
