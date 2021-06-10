package com.gible147.thunder.registry;

import com.gible147.thunder.Thunder;

import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.gible147.thunder.registry.ModBlocks.LIGHTNING_STONE;

public class ModItems {

    public static final Item LIGHTNING_BOW = new BowItem(new Item.Settings().group(Thunder.ITEM_GROUP).maxCount(1));
    public static final BlockItem LIGHTNING_STONE  = new BlockItem(ModBlocks.LIGHTNING_STONE, new Item.Settings().group(Thunder.ITEM_GROUP).maxCount(16));
    public static final TridentItem THUNDER_STAFF = new TridentItem(new Item.Settings().group(Thunder.ITEM_GROUP).maxCount(1));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Thunder.MOD_ID, "lightning_bow"), LIGHTNING_BOW);
        Registry.register(Registry.ITEM, new Identifier(Thunder.MOD_ID, "lightning_stone"), LIGHTNING_STONE);
        Registry.register(Registry.ITEM, new Identifier(Thunder.MOD_ID, "thunder_staff"), THUNDER_STAFF);
    }




}
